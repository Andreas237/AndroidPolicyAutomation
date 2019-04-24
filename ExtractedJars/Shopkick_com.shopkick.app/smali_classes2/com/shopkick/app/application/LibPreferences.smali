.class public Lcom/shopkick/app/application/LibPreferences;
.super Ljava/lang/Object;
.source "LibPreferences.java"


# static fields
.field private static final AES_ALGORITHM:Ljava/lang/String; = "AES/CBC/PKCS7Padding"

.field private static final AES_KEY_TYPE:Ljava/lang/String; = "AES"

.field public static final APIMANAGER_TOKEN:Ljava/lang/String; = "APIManagerToken"

.field public static final APP_INSTALL_TS:Ljava/lang/String; = "app_install_ts"

.field private static final AUTH_MANAGER_ACCESS_TOKEN:Ljava/lang/String; = "AuthManagerAccessToken"

.field private static final AUTH_MANAGER_REFRESH_TOKEN:Ljava/lang/String; = "AuthManagerRefreshToken"

.field public static final DEVICE_HAS_REGISTERED:Ljava/lang/String; = "device_has_registered"

.field private static final HMAC_SHA256_ALGORITHM:Ljava/lang/String; = "HmacSHA256"

.field private static final IV_SIZE:I = 0x10

.field private static final KCID:Ljava/lang/String; = "kcid"

.field private static final KEY_SIZE:I = 0x20

.field public static final PREFS_NAME:Ljava/lang/String; = "com.shopkick.app.prefs"

.field private static final RANDOM_GEN_ALGORITHM:Ljava/lang/String; = "SHA1PRNG"

.field private static final SMALL_KEY_SIZE:I = 0x8

.field public static final USER_ACCOUNT:Ljava/lang/String; = "user_account"


# instance fields
.field protected prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const-string v0, "com.shopkick.app.prefs"

    const/4 v1, 0x0

    .line 73
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The argument \'context\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private generateKey(I)[B
    .locals 6

    .line 449
    new-array v0, p1, [B

    const-wide/32 v1, 0x807d950

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_0

    const-wide/32 v4, 0x3c88596c

    mul-long/2addr v1, v4

    const-wide v4, 0x100000000L

    .line 454
    rem-long/2addr v1, v4

    const-wide/16 v4, 0x100

    .line 455
    rem-long v4, v1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getString([B[B)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_1

    .line 432
    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "HmacSHA256"

    invoke-direct {v1, p2, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :try_start_0
    const-string p2, "HmacSHA256"

    .line 435
    invoke-static {p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p2

    .line 436
    invoke-virtual {p2, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 437
    invoke-virtual {p2, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1

    const/4 p2, 0x0

    .line 438
    invoke-static {p1, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 442
    const-class p2, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 440
    const-class p2, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0

    :cond_1
    :goto_1
    return-object v0
.end method


# virtual methods
.method public clearAppPrefs()V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 82
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 83
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public deleteAuthManagerAccessToken()V
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "AuthManagerAccessToken"

    .line 262
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 264
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 266
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public deleteAuthManagerRefreshToken()V
    .locals 2

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "AuthManagerRefreshToken"

    .line 302
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 304
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 306
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final generateIV(I)[B
    .locals 2

    .line 462
    new-array p1, p1, [B

    :try_start_0
    const-string v0, "SHA1PRNG"

    .line 465
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v0

    .line 466
    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 468
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object p1
.end method

.method public getAPIManagerToken()Ljava/lang/String;
    .locals 3

    const-string v0, "APIManagerToken"

    .line 216
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 220
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppInstalledTimestamp()J
    .locals 4

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "app_install_ts"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getAuthManagerAccessToken()Ljava/lang/String;
    .locals 3

    const-string v0, "AuthManagerAccessToken"

    .line 249
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 253
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 254
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAuthManagerRefreshToken()Ljava/lang/String;
    .locals 3

    const-string v0, "AuthManagerRefreshToken"

    .line 289
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 293
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 294
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public getFloat(Ljava/lang/String;)F
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getKCID()Ljava/lang/String;
    .locals 3

    const-string v0, "kcid"

    .line 192
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 196
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 197
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const-wide/16 v1, 0x0

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getSharedPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getUserAccountJSON()Ljava/lang/String;
    .locals 3

    const-string/jumbo v0, "user_account"

    .line 171
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 175
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isDeviceHasRegistered()Z
    .locals 3

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "device_has_registered"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 93
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 94
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public putFloat(Ljava/lang/String;F)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 115
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 116
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public putInt(Ljava/lang/String;I)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 104
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 105
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public putLong(Ljava/lang/String;J)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 126
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 127
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 137
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 138
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method protected secureNameForKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/16 v0, 0x8

    .line 325
    invoke-direct {p0, v0}, Lcom/shopkick/app/application/LibPreferences;->generateKey(I)[B

    move-result-object v0

    .line 326
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/application/LibPreferences;->getString([B[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected secureValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/16 v1, 0x20

    .line 340
    invoke-direct {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->generateKey(I)[B

    move-result-object v1

    const/16 v2, 0x10

    .line 341
    invoke-virtual {p0, v2}, Lcom/shopkick/app/application/LibPreferences;->generateIV(I)[B

    move-result-object v3

    .line 343
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v5, "AES"

    invoke-direct {v4, v1, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 344
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    :try_start_0
    const-string v5, "AES/CBC/PKCS7Padding"

    .line 347
    invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    const/4 v6, 0x1

    .line 348
    invoke-virtual {v5, v6, v4, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 349
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v5, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 350
    array-length v1, p1

    add-int/lit8 v4, v1, 0x10

    .line 352
    new-array v4, v4, [B

    const/4 v5, 0x0

    .line 353
    invoke-static {v3, v5, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 354
    invoke-static {p1, v5, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 355
    new-instance p1, Ljava/lang/String;

    invoke-static {v4, v5}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {p1, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 369
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 367
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 365
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_3
    move-exception p1

    .line 363
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_4
    move-exception p1

    .line 361
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_5
    move-exception p1

    .line 359
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_6
    move-exception p1

    .line 357
    const-class v1, Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public setAPIManagerToken(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 204
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "APIManagerToken"

    .line 206
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 207
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/LibPreferences;->secureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 209
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void
.end method

.method public setAppInstalledTimestamp()V
    .locals 4

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "app_install_ts"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "app_install_ts"

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 150
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public setAuthManagerAccessToken(Ljava/lang/String;)V
    .locals 2

    .line 234
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "AuthManagerAccessToken"

    .line 236
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 237
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/LibPreferences;->secureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 239
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 241
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void
.end method

.method public setAuthManagerRefreshToken(Ljava/lang/String;)V
    .locals 2

    .line 274
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "AuthManagerRefreshToken"

    .line 276
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 277
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/LibPreferences;->secureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 279
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 281
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void
.end method

.method public setDeviceHasRegistered(Z)V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "device_has_registered"

    .line 226
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 227
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setKCID(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 180
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "kcid"

    .line 182
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 183
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/LibPreferences;->secureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 185
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 187
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void
.end method

.method public setUserAccountJSON(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 159
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/application/LibPreferences;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string/jumbo v1, "user_account"

    .line 161
    invoke-virtual {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->secureNameForKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/LibPreferences;->secureValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 164
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 166
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void
.end method

.method protected valueFromSecureValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/16 v1, 0x20

    .line 384
    invoke-direct {p0, v1}, Lcom/shopkick/app/application/LibPreferences;->generateKey(I)[B

    move-result-object v1

    const/4 v2, 0x0

    .line 386
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    const/16 v3, 0x10

    .line 388
    new-array v4, v3, [B

    .line 389
    invoke-static {p1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 390
    array-length v5, p1

    sub-int/2addr v5, v3

    .line 391
    new-array v6, v5, [B

    .line 392
    invoke-static {p1, v3, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 394
    new-instance p1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES"

    invoke-direct {p1, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 395
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    :try_start_0
    const-string v2, "AES/CBC/PKCS7Padding"

    .line 399
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    const/4 v3, 0x2

    .line 400
    invoke-virtual {v2, v3, p1, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 401
    invoke-virtual {v2, v6}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 402
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 416
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception p1

    .line 414
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception p1

    .line 412
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_3
    move-exception p1

    .line 410
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_4
    move-exception p1

    .line 408
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_5
    move-exception p1

    .line 406
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_6
    move-exception p1

    .line 404
    const-class v1, Lcom/shopkick/app/application/Account;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0
.end method
