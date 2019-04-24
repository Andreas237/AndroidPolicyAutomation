.class public Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DE_AES_CBC_HEX_Util"

.field private static final SECRET_KEY_E:Ljava/lang/String; = "53423F138A2F9BCDC27C2B1DC12B379D"

.field private static SECRET_KEY_S:Ljava/lang/String; = null

.field private static final VERSION_1:C = '1'

.field private static final VERSION_INARY:C = '2'

.field private static key:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->SECRET_KEY_S:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->key:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;)[B
    .locals 1

    .line 17
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getSecret(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 200
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 202
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt data == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    return-object v0

    .line 207
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 212
    :try_start_0
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;

    const/16 v1, 0x31

    invoke-direct {v0, p1, v1}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;-><init>(Ljava/lang/String;C)V

    invoke-static {p0, v0}, Lcom/huawei/hihealthservice/old/db/util/EncryptUtil;->decrypter(Ljava/lang/String;Lcom/huawei/hihealthservice/old/util/IEncryptManager;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 218
    goto :goto_0

    .line 214
    :catch_0
    move-exception v7

    .line 216
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const-string v2, "desEncrypt Exception"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 219
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 220
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

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

    .line 221
    return-object v6
.end method

.method public static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 169
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 171
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encrypt data == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 181
    :try_start_0
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;

    const/16 v1, 0x31

    invoke-direct {v0, p1, v1}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;-><init>(Ljava/lang/String;C)V

    invoke-static {p0, v0}, Lcom/huawei/hihealthservice/old/db/util/EncryptUtil;->encrypter(Ljava/lang/String;Lcom/huawei/hihealthservice/old/util/IEncryptManager;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 189
    goto :goto_0

    .line 185
    :catch_0
    move-exception v7

    .line 187
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const-string v2, "encrypt Exception"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 190
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 191
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

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

    .line 192
    return-object v6
.end method

.method public static getKey(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 77
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKeySync(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized getKeySync(Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    const-class v9, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;

    monitor-enter v9

    .line 85
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

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

    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 87
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 89
    sget-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->key:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;-><init>(Landroid/content/Context;)V

    const-string v1, "AES_CBC"

    .line 92
    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->get(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v6

    .line 93
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 95
    new-instance v6, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    invoke-direct {v6}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;-><init>()V

    .line 96
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->genRandBytes(I)[B

    move-result-object v7

    .line 97
    const/4 v0, 0x0

    invoke-static {v7, v0}, Lcom/huawei/hihealthservice/old/util/HEX;->encode([BI)Ljava/lang/String;

    move-result-object v8

    .line 98
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->setData(Ljava/lang/String;)V

    .line 100
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->getData()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->key:Ljava/lang/String;

    .line 102
    sget-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->key:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "load AES_CBC_KEY failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->initSecretKeyS(Landroid/content/Context;)V

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 110
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

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

    .line 111
    sget-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->key:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v9

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method

.method private static declared-synchronized getSecret(Ljava/lang/String;)[B
    .locals 4

    const-class v3, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;

    monitor-enter v3

    .line 116
    const/4 v0, 0x3

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->SECRET_KEY_S:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "53423F138A2F9BCDC27C2B1DC12B379D"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p0, v0, v1

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->genRootKey([Ljava/lang/String;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static initSecretKeyS(Landroid/content/Context;)V
    .locals 0

    .line 120
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->initSecretKeySSync(Landroid/content/Context;)V

    .line 121
    return-void
.end method

.method private static declared-synchronized initSecretKeySSync(Landroid/content/Context;)V
    .locals 9

    const-class v8, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;

    monitor-enter v8

    .line 125
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 127
    sget-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->SECRET_KEY_S:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-eqz v0, :cond_3

    .line 129
    const/4 v4, 0x0

    .line 132
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "w"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 133
    if-eqz v4, :cond_0

    .line 135
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/db/util/Utils;->inputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->SECRET_KEY_S:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    :cond_0
    if-eqz v4, :cond_2

    .line 148
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    goto :goto_1

    .line 150
    :catch_0
    move-exception v5

    .line 152
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const-string v2, "finally initSecretKeyS IOException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    goto :goto_1

    .line 138
    :catch_1
    move-exception v5

    .line 140
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const-string v2, "initSecretKeyS IOException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 144
    if-eqz v4, :cond_2

    .line 148
    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 153
    goto :goto_1

    .line 150
    :catch_2
    move-exception v5

    .line 152
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const-string v2, "finally initSecretKeyS IOException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 153
    goto :goto_1

    .line 144
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_1

    .line 148
    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 153
    goto :goto_0

    .line 150
    :catch_3
    move-exception v7

    .line 152
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const-string v2, "finally initSecretKeyS IOException"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    :cond_1
    :goto_0
    throw v6

    .line 157
    :cond_2
    :goto_1
    sget-object v0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->SECRET_KEY_S:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 159
    const-string v0, "Debug_DE_AES_CBC_HEX_Util"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "load SECRET_KEY_S failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 162
    :cond_3
    monitor-exit v8

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v8

    throw p0
.end method
