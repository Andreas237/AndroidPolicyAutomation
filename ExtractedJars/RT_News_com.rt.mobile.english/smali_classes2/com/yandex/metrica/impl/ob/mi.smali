.class public Lcom/yandex/metrica/impl/ob/mi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "AES/CBC/PKCS5Padding"

    const-string v1, "RSA/ECB/PKCS1Padding"

    .line 40
    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/mi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/mi;->a:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/mi;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 52
    :try_start_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/16 v1, 0x10

    .line 53
    new-array v2, v1, [B

    .line 54
    new-array v1, v1, [B

    .line 55
    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 56
    invoke-virtual {v0, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    const-string v0, "RSA"

    .line 57
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    const-string v4, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhmH/m2qrRjxDHP794CeaZpENQNYydf8pqyXJilo6XxK+n+pvo27VxWfB3Z1yHrtKow+eZXKLQzrQ8wZMfRgADrYCQJ20y2hGZEUCN1tGSM+xqVKMeCtVi3NvQa54Cx7mT5ECVsH5DKEs/aeScDHP56FzcgEbtOSwyRZ8dsEM0wwIDAQAB"

    const/4 v5, 0x0

    .line 58
    invoke-static {v4, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 57
    invoke-virtual {v0, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    .line 61
    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/yandex/metrica/impl/ob/mi;->a([B[B[BLjava/security/PublicKey;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method a([B[B[BLjava/security/PublicKey;)[B
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 73
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    array-length v2, p2

    array-length v3, p3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 75
    invoke-virtual {v1, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 76
    invoke-virtual {v1, p3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 78
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 79
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 81
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/mi;->b:Ljava/lang/String;

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v3, 0x1

    .line 83
    invoke-virtual {v1, v3, p4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 85
    new-instance p4, Ljava/io/ByteArrayOutputStream;

    array-length v3, p1

    invoke-direct {p4, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 86
    :try_start_1
    invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 87
    new-instance v1, Lcom/yandex/metrica/impl/ob/mg;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/mi;->a:Ljava/lang/String;

    invoke-direct {v1, v2, p2, p3}, Lcom/yandex/metrica/impl/ob/mg;-><init>(Ljava/lang/String;[B[B)V

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/mg;->a([B)[B

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 89
    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    invoke-static {p4}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    move-object v0, p4

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 94
    throw p1

    :catch_0
    move-object p4, v0

    .line 93
    :catch_1
    invoke-static {p4}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    return-object v0
.end method
