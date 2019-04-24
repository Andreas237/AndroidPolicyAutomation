.class public Lcom/tencent/open/utils/SystemUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACTION_LOGIN:Ljava/lang/String; = "action_login"

.field public static final ACTION_SHARE:Ljava/lang/String; = "action_share"

.field public static final H5_SHARE_DATA:Ljava/lang/String; = "h5_share_data"

.field public static final IS_LOGIN:Ljava/lang/String; = "is_login"

.field public static final IS_QQ_MOBILE_SHARE:Ljava/lang/String; = "is_qq_mobile_share"

.field public static final QQDATALINE_CALLBACK_ACTION:Ljava/lang/String; = "sendToMyComputer"

.field public static final QQFAVORITES_CALLBACK_ACTION:Ljava/lang/String; = "addToQQFavorites"

.field public static final QQ_SHARE_CALLBACK_ACTION:Ljava/lang/String; = "shareToQQ"

.field public static final QQ_VERSION_NAME_4_2_0:Ljava/lang/String; = "4.2.0"

.field public static final QQ_VERSION_NAME_4_3_0:Ljava/lang/String; = "4.3.0"

.field public static final QQ_VERSION_NAME_4_5_0:Ljava/lang/String; = "4.5.0"

.field public static final QQ_VERSION_NAME_4_6_0:Ljava/lang/String; = "4.6.0"

.field public static final QQ_VERSION_NAME_5_0_0:Ljava/lang/String; = "5.0.0"

.field public static final QQ_VERSION_NAME_5_1_0:Ljava/lang/String; = "5.1.0"

.field public static final QQ_VERSION_NAME_5_2_0:Ljava/lang/String; = "5.2.0"

.field public static final QQ_VERSION_NAME_5_3_0:Ljava/lang/String; = "5.3.0"

.field public static final QZONE_SHARE_CALLBACK_ACTION:Ljava/lang/String; = "shareToQzone"

.field public static final TROOPBAR_CALLBACK_ACTION:Ljava/lang/String; = "shareToTroopBar"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 395
    const-wide/16 v3, 0x0

    .line 396
    const/4 v5, 0x0

    .line 397
    const/16 v0, 0x2000

    new-array v6, v0, [B

    .line 398
    :goto_0
    array-length v0, v6

    const/4 v1, 0x0

    const/16 v0, 0x2000

    invoke-virtual {p0, v6, v1, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 399
    const/4 v0, 0x0

    invoke-virtual {p1, v6, v0, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 400
    int-to-long v0, v5

    add-long/2addr v3, v0

    goto :goto_0

    .line 403
    :cond_0
    const-string v0, "openSDK_LOG.SysUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->copy, copyed size is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    return-wide v3
.end method

.method public static checkMobileQQ(Landroid/content/Context;)Z
    .locals 8

    .line 235
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 236
    const/4 v3, 0x0

    .line 238
    const-string v0, "com.tencent.mobileqq"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 242
    goto :goto_0

    .line 239
    :catch_0
    move-exception v4

    .line 240
    const-string v0, "checkMobileQQ"

    const-string v1, "error"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v4}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 243
    :goto_0
    if-eqz v3, :cond_2

    .line 244
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 247
    const-string v0, "MobileQQ verson"

    :try_start_1
    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v0, "\\."

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 249
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 250
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v7

    .line 251
    const/4 v0, 0x4

    if-gt v6, v0, :cond_0

    const/4 v0, 0x4

    if-ne v6, v0, :cond_1

    const/4 v0, 0x1

    if-lt v7, v0, :cond_1

    .line 252
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 254
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 256
    :catch_1
    move-exception v6

    .line 257
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V

    .line 260
    const/4 v0, 0x0

    return v0

    .line 262
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 226
    const-string v0, "com.tencent.mobileqq"

    invoke-static {p0, v0}, Lcom/tencent/open/utils/SystemUtils;->getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 227
    invoke-static {v1, p1}, Lcom/tencent/open/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static compareVersion(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 84
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 85
    const/4 v0, 0x0

    return v0

    .line 86
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_1

    .line 87
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_1
    if-nez p0, :cond_2

    if-eqz p1, :cond_2

    .line 89
    const/4 v0, -0x1

    return v0

    .line 92
    :cond_2
    const-string v0, "\\."

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 93
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 96
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    array-length v0, v1

    if-ge v3, v0, :cond_5

    array-length v0, v2

    if-ge v3, v0, :cond_5

    .line 97
    aget-object v0, v1, v3

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 98
    aget-object v0, v2, v3

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 99
    if-ge v4, v5, :cond_3

    .line 100
    const/4 v0, -0x1

    return v0

    .line 101
    :cond_3
    if-le v4, v5, :cond_4

    .line 102
    const/4 v0, 0x1

    return v0

    .line 96
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 105
    :cond_5
    :try_start_1
    array-length v0, v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    if-le v0, v3, :cond_6

    .line 106
    const/4 v0, 0x1

    return v0

    .line 107
    :cond_6
    :try_start_2
    array-length v0, v2
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    if-le v0, v3, :cond_7

    .line 108
    const/4 v0, -0x1

    return v0

    .line 110
    :cond_7
    const/4 v0, 0x0

    return v0

    .line 112
    :catch_0
    move-exception v4

    .line 113
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static extractSecureLib(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .line 302
    const-string v0, "openSDK_LOG.SysUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->extractSecureLib, libName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 304
    if-nez v3, :cond_0

    .line 305
    const-string v0, "openSDK_LOG.SysUtils"

    const-string v1, "-->extractSecureLib, global context is null. "

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const/4 v0, 0x0

    return v0

    .line 309
    :cond_0
    const-string v0, "secure_lib"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 311
    new-instance v5, Ljava/io/File;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v5, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 312
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 313
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    .line 314
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    goto :goto_0

    .line 317
    :catch_0
    move-exception v7

    .line 318
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V

    .line 321
    :cond_1
    :goto_0
    goto :goto_1

    .line 322
    :cond_2
    const-string v0, "version"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 323
    const-string v0, "openSDK_LOG.SysUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->extractSecureLib, libVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | oldVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    if-ne p2, v6, :cond_3

    .line 325
    const/4 v0, 0x1

    return v0

    .line 329
    :cond_3
    :goto_1
    const/4 v6, 0x0

    .line 330
    const/4 v7, 0x0

    .line 332
    :try_start_1
    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 333
    const/4 v0, 0x0

    invoke-virtual {v3, p1, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v7, v0

    .line 335
    invoke-static {v6, v7}, Lcom/tencent/open/utils/SystemUtils;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 337
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    .line 338
    const-string v0, "version"

    invoke-interface {v8, v0, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 339
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 340
    const/4 v9, 0x1

    .line 344
    if-eqz v6, :cond_4

    .line 346
    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 349
    goto :goto_2

    .line 347
    :catch_1
    move-exception v10

    .line 351
    :cond_4
    :goto_2
    if-eqz v7, :cond_5

    .line 353
    :try_start_3
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 356
    goto :goto_3

    .line 354
    :catch_2
    move-exception v10

    .line 356
    :cond_5
    :goto_3
    return v9

    .line 341
    :catch_3
    move-exception v8

    .line 342
    const-string v0, "openSDK_LOG.SysUtils"

    const-string v1, "-->extractSecureLib, when copy lib execption."

    :try_start_4
    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 344
    if-eqz v6, :cond_6

    .line 346
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 349
    goto :goto_4

    .line 347
    :catch_4
    move-exception v8

    .line 351
    :cond_6
    :goto_4
    if-eqz v7, :cond_9

    .line 353
    :try_start_6
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 356
    goto :goto_7

    .line 354
    :catch_5
    move-exception v8

    .line 356
    goto :goto_7

    .line 344
    :catchall_0
    move-exception v11

    if-eqz v6, :cond_7

    .line 346
    :try_start_7
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 349
    goto :goto_5

    .line 347
    :catch_6
    move-exception v12

    .line 351
    :cond_7
    :goto_5
    if-eqz v7, :cond_8

    .line 353
    :try_start_8
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 356
    goto :goto_6

    .line 354
    :catch_7
    move-exception v12

    .line 356
    :cond_8
    :goto_6
    throw v11

    .line 359
    :cond_9
    :goto_7
    const/4 v0, 0x0

    return v0
.end method

.method public static getAndroidSDKVersion()I
    .locals 3

    .line 267
    const/4 v1, 0x0

    .line 269
    :try_start_0
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 271
    goto :goto_0

    .line 270
    :catch_0
    move-exception v2

    .line 272
    :goto_0
    return v1
.end method

.method public static getAppName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 215
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 216
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAppSignatureMD5(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 153
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, getSignValidString"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v3, ""

    .line 156
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 158
    const/16 v0, 0x40

    invoke-virtual {v5, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 159
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 161
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v8

    .line 162
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 163
    invoke-virtual {v8}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->toHexString([B)Ljava/lang/String;

    move-result-object v9

    .line 164
    invoke-virtual {v8}, Ljava/security/MessageDigest;->reset()V

    .line 166
    const-string v0, "SystemUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->sign: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 169
    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 170
    invoke-virtual {v8}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->toHexString([B)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 171
    invoke-virtual {v8}, Ljava/security/MessageDigest;->reset()V

    .line 173
    const-string v0, "SystemUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->signEncryped: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_0

    .line 174
    :catch_0
    move-exception v4

    .line 175
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 176
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, getSignValidString error"

    invoke-static {v0, v1, v4}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    :goto_0
    return-object v3
.end method

.method public static getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 64
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 67
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 68
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 69
    :catch_0
    move-exception v3

    .line 70
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getRealPathFromUri(Landroid/app/Activity;Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    .line 203
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "_data"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 204
    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/app/Activity;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 205
    if-eqz v7, :cond_0

    .line 206
    const-string v0, "_data"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    .line 207
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 208
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 210
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 3

    .line 192
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 193
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 197
    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 198
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isAppSignatureValid(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 126
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, validateAppSignatureForPackage"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 133
    goto :goto_0

    .line 131
    :catch_0
    move-exception v3

    .line 132
    const/4 v0, 0x0

    return v0

    .line 135
    :goto_0
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 136
    invoke-virtual {v6}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 137
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    const/4 v0, 0x1

    return v0

    .line 135
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 142
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static isLibExtracted(Ljava/lang/String;I)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .line 370
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 371
    if-nez v3, :cond_0

    .line 372
    const-string v0, "openSDK_LOG.SysUtils"

    const-string v1, "-->isSecureLibExtracted, global context is null. "

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const/4 v0, 0x0

    return v0

    .line 376
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v4, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 378
    const-string v0, "secure_lib"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 379
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 380
    const-string v0, "version"

    const/4 v1, 0x0

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 381
    const-string v0, "openSDK_LOG.SysUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->extractSecureLib, libVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | oldVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    if-ne p1, v6, :cond_1

    .line 383
    const/4 v0, 0x1

    return v0

    .line 386
    :cond_1
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    .line 387
    const-string v0, "version"

    invoke-interface {v7, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 388
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 391
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isSupportMultiTouch()Z
    .locals 9

    .line 276
    const/4 v2, 0x0

    .line 277
    const/4 v3, 0x0

    .line 279
    const-class v0, Landroid/view/MotionEvent;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    .line 280
    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    .line 281
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPointerCount"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const/4 v2, 0x1

    .line 284
    :cond_0
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPointerId"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    const/4 v3, 0x1

    .line 280
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 288
    :cond_2
    invoke-static {}, Lcom/tencent/open/utils/SystemUtils;->getAndroidSDKVersion()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_3

    if-eqz v2, :cond_4

    if-eqz v3, :cond_4

    .line 289
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 291
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
