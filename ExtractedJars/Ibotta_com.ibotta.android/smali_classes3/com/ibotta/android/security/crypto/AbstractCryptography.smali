.class public abstract Lcom/ibotta/android/security/crypto/AbstractCryptography;
.super Ljava/lang/Object;
.source "AbstractCryptography.java"

# interfaces
.implements Lcom/ibotta/android/security/crypto/Cryptography;


# instance fields
.field private cipher:Ljavax/crypto/Cipher;

.field private key:Ljavax/crypto/spec/SecretKeySpec;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private spec:Ljava/security/spec/AlgorithmParameterSpec;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method private getIV()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    const/16 v0, 0x10

    .line 91
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    .line 93
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    return-object v1

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 76
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->cipher:Ljavax/crypto/Cipher;

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->key:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v4, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->spec:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v1, v2, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 77
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 79
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Failed to decrypt."

    .line 81
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 57
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->cipher:Ljavax/crypto/Cipher;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->key:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v4, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->spec:Ljava/security/spec/AlgorithmParameterSpec;

    invoke-virtual {v1, v2, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->cipher:Ljavax/crypto/Cipher;

    const-string v2, "UTF-8"

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 59
    new-instance v1, Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p1

    const-string v2, "UTF-8"

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Failed to encrypt."

    .line 61
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method protected abstract getSecretKey()[C
.end method

.method public init()V
    .locals 4

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "SHA-256"

    .line 35
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 36
    new-instance v2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ibotta/android/security/crypto/AbstractCryptography;->getSecretKey()[C

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    const-string v3, "UTF-8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update([B)V

    const/16 v2, 0x20

    .line 37
    new-array v2, v2, [B

    .line 38
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    array-length v3, v2

    invoke-static {v1, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const-string v1, "AES/CBC/PKCS5Padding"

    .line 40
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->cipher:Ljavax/crypto/Cipher;

    .line 41
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->key:Ljavax/crypto/spec/SecretKeySpec;

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/security/crypto/AbstractCryptography;->getIV()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->spec:Ljava/security/spec/AlgorithmParameterSpec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Failed to initialize."

    .line 44
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/AbstractCryptography;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
