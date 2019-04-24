.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 308
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 310
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 313
    goto :goto_0

    .line 311
    :catch_0
    move-exception v3

    .line 312
    const-string v0, "SaltDeal"

    const-string v1, "signData UnsupportedEncodingException..."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    :goto_0
    const/4 v3, 0x0

    .line 317
    const-string v0, "HwKeyStore"

    :try_start_1
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v3

    .line 321
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 324
    const-string v0, "HwKey"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Ljava/security/KeyStore;->getEntry(Ljava/lang/String;Ljava/security/KeyStore$ProtectionParameter;)Ljava/security/KeyStore$Entry;

    move-result-object v4

    .line 333
    if-nez v4, :cond_0

    .line 334
    const-string v0, "SaltDeal"

    const-string v1, "No key found under alias: HwKey"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const-string v0, "SaltDeal"

    const-string v1, "Exiting signData()..."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/UnrecoverableEntryException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/security/SignatureException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    .line 336
    const/4 v0, 0x0

    return-object v0

    .line 344
    :cond_0
    instance-of v0, v4, Ljava/security/KeyStore$PrivateKeyEntry;

    if-nez v0, :cond_1

    .line 345
    const-string v0, "SaltDeal"

    const-string v1, "Not an instance of a PrivateKeyEntry"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v0, "SaltDeal"

    const-string v1, "Exiting signData()..."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/security/UnrecoverableEntryException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/security/SignatureException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    .line 347
    const/4 v0, 0x0

    return-object v0

    .line 355
    :cond_1
    const-string v0, "SHA256withRSA"

    const-string v1, "HwUniversalKeyStoreProvider"

    :try_start_3
    invoke-static {v0, v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v5

    .line 358
    move-object v0, v4

    check-cast v0, Ljava/security/KeyStore$PrivateKeyEntry;

    invoke-virtual {v0}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 360
    invoke-virtual {v5, v2}, Ljava/security/Signature;->update([B)V

    .line 361
    invoke-virtual {v5}, Ljava/security/Signature;->sign()[B

    move-result-object v6

    .line 362
    invoke-static {v6}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/f;->a([B)Ljava/lang/String;
    :try_end_3
    .catch Ljava/security/KeyStoreException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/security/UnrecoverableEntryException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/security/SignatureException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    move-result-object v7

    .line 371
    return-object v7

    .line 372
    :catch_1
    move-exception v4

    .line 373
    const-string v0, "SaltDeal"

    const-string v1, "signData: "

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 374
    :catch_2
    move-exception v4

    .line 375
    const-string v0, "SaltDeal"

    const-string v1, "signData: IOException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 376
    :catch_3
    move-exception v4

    .line 377
    const-string v0, "SaltDeal"

    const-string v1, "signData: CertificateException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 378
    :catch_4
    move-exception v4

    .line 379
    const-string v0, "SaltDeal"

    const-string v1, "signData: NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 380
    :catch_5
    move-exception v4

    .line 381
    const-string v0, "SaltDeal"

    const-string v1, "signData: InvalidKeyException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 382
    :catch_6
    move-exception v4

    .line 383
    const-string v0, "SaltDeal"

    const-string v1, "signData: UnrecoverableEntryException "

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 384
    :catch_7
    move-exception v4

    .line 385
    const-string v0, "SaltDeal"

    const-string v1, "signData: SignatureException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 386
    :catch_8
    move-exception v4

    .line 387
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    .line 212
    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/security/KeyPair;
    .locals 10
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 232
    new-instance v4, Ljava/util/GregorianCalendar;

    invoke-direct {v4}, Ljava/util/GregorianCalendar;-><init>()V

    .line 233
    new-instance v5, Ljava/util/GregorianCalendar;

    invoke-direct {v5}, Ljava/util/GregorianCalendar;-><init>()V

    .line 234
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 240
    const/4 v6, 0x0

    .line 242
    const-string v0, "RSA"

    const-string v1, "HwUniversalKeyStoreProvider"

    :try_start_0
    invoke-static {v0, v1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v6

    .line 248
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 249
    const/16 v0, 0x17

    if-ge v8, v0, :cond_0

    .line 251
    new-instance v0, Landroid/security/KeyPairGeneratorSpec$Builder;

    invoke-direct {v0, p0}, Landroid/security/KeyPairGeneratorSpec$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "HwKey"

    .line 253
    invoke-virtual {v0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setAlias(Ljava/lang/String;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object v0

    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    const-string v2, "CN=HwKey"

    invoke-direct {v1, v2}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object v0

    .line 258
    const-wide/16 v1, 0x539

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSerialNumber(Ljava/math/BigInteger;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object v0

    .line 260
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setStartDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object v0

    .line 261
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEndDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/security/KeyPairGeneratorSpec$Builder;->build()Landroid/security/KeyPairGeneratorSpec;

    move-result-object v7

    goto :goto_0

    .line 266
    :cond_0
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const-string v1, "HwKey"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    new-instance v1, Ljavax/security/auth/x500/X500Principal;

    const-string v2, "CN=HwKey"

    invoke-direct {v1, v2}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 267
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "SHA-256"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 268
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "PKCS1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 269
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setSignaturePaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 270
    const-wide/16 v1, 0x539

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateSerialNumber(Ljava/math/BigInteger;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 271
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateNotBefore(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 272
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setCertificateNotAfter(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const-string v1, "hwkeystory"

    .line 273
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAttestationChallenge([B)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 274
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v7

    .line 276
    :goto_0
    invoke-virtual {v6, v7}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 277
    invoke-virtual {v6}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v9

    .line 278
    return-object v9

    .line 280
    :catch_0
    move-exception v7

    .line 281
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto :goto_1

    .line 282
    :catch_1
    move-exception v7

    .line 283
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: NoSuchProviderException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto :goto_1

    .line 284
    :catch_2
    move-exception v7

    .line 285
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: InvalidAlgorithmParameterException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto :goto_1

    .line 286
    :catch_3
    move-exception v7

    .line 287
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: NoSuchMethodError"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto :goto_1

    .line 288
    :catch_4
    move-exception v7

    .line 289
    const-string v0, "SaltDeal"

    const-string v1, "createKeys: Exception"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a()[Ljava/security/cert/Certificate;
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 164
    const-string v0, "RSA"

    const-string v1, "HwUniversalKeyStoreProvider"

    :try_start_0
    invoke-static {v0, v1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v4

    .line 165
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const-string v1, "key1"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "SHA-256"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "SHA-384"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "SHA-512"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 167
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 170
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setUserAuthenticationRequired(Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const-string v1, "hwkeystory"

    .line 171
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAttestationChallenge([B)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 172
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v0

    .line 165
    invoke-virtual {v4, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 173
    const-string v0, "HwKeyStore"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v5

    .line 174
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 175
    const-string v0, "HwKey"

    invoke-virtual {v5, v0}, Ljava/security/KeyStore;->getCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    move-result-object v6

    .line 193
    return-object v6

    .line 194
    :catch_0
    move-exception v4

    .line 195
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 196
    :catch_1
    move-exception v4

    .line 197
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: NoSuchProviderException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 198
    :catch_2
    move-exception v4

    .line 199
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: InvalidAlgorithmParameterException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 200
    :catch_3
    move-exception v4

    .line 201
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: CertificateException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 202
    :catch_4
    move-exception v4

    .line 203
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: KeyStoreException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 204
    :catch_5
    move-exception v4

    .line 205
    const-string v0, "SaltDeal"

    const-string v1, "getCertificate: IOException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
