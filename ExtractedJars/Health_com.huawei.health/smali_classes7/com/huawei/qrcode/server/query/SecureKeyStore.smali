.class public Lcom/huawei/qrcode/server/query/SecureKeyStore;
.super Ljava/lang/Object;


# static fields
.field private static final SCAN_SDK_REGULAR_CER_NAME:Ljava/lang/String; = "sqrcode_sdk_regular.cer"

.field private static final SCAN_SDK_TEST_CER_NAME:Ljava/lang/String; = "sqrcode_sdk_test.cer"

.field private static final TRUST_FILE:Ljava/lang/String; = "sqrcode_sdk_regular.cer"

.field private static lock:Ljava/util/concurrent/locks/ReentrantLock; = null

.field private static sKeyStore:Ljava/security/KeyStore; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getKeystore(Landroid/content/Context;)Ljava/security/KeyStore;
    .locals 11

    const/4 v3, 0x0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    sget-object v3, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v4

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v4

    :goto_0
    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v4, 0x0

    :try_start_1
    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;

    if-eqz v0, :cond_1

    sget-object v5, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    nop

    return-object v5

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "sqrcode_sdk_regular.cer"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v6

    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;

    const-string v1, "hicloudroot"

    invoke-virtual {v0, v1, v6}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    sget-object v7, Lcom/huawei/qrcode/server/query/SecureKeyStore;->sKeyStore:Ljava/security/KeyStore;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    const/4 v4, 0x0

    goto :goto_1

    :catch_0
    move-exception v8

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_2
    :goto_1
    return-object v7

    :catch_1
    move-exception v5

    const-string v0, "SecureKeyStore IOException: "

    const/4 v1, 0x0

    :try_start_4
    invoke-static {v0, v5, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/4 v6, 0x0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    const/4 v4, 0x0

    goto :goto_2

    :catch_2
    move-exception v7

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_3
    :goto_2
    return-object v6

    :catch_3
    move-exception v5

    const-string v0, "SecureKeyStore CertificateException: "

    const/4 v1, 0x0

    :try_start_6
    invoke-static {v0, v5, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    const/4 v6, 0x0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    const/4 v4, 0x0

    goto :goto_3

    :catch_4
    move-exception v7

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_4
    :goto_3
    return-object v6

    :catch_5
    move-exception v5

    const-string v0, "SecureKeyStore KeyStoreException: "

    const/4 v1, 0x0

    :try_start_8
    invoke-static {v0, v5, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    const/4 v6, 0x0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    :try_start_9
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    const/4 v4, 0x0

    goto :goto_4

    :catch_6
    move-exception v7

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_5
    :goto_4
    return-object v6

    :catch_7
    move-exception v5

    const-string v0, "SecureKeyStore NoSuchAlgorithmException: "

    const/4 v1, 0x0

    :try_start_a
    invoke-static {v0, v5, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    const/4 v6, 0x0

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    :try_start_b
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_8

    const/4 v4, 0x0

    goto :goto_5

    :catch_8
    move-exception v7

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_6
    :goto_5
    return-object v6

    :catchall_1
    move-exception v9

    sget-object v0, Lcom/huawei/qrcode/server/query/SecureKeyStore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9

    const/4 v4, 0x0

    goto :goto_6

    :catch_9
    move-exception v10

    const-string v0, "SecureKeyStore hicloudrootIns close IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_7
    :goto_6
    throw v9
.end method
