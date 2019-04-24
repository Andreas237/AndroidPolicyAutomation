.class public Lorg/jivesoftware/smack/util/MAC;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HMACSHA1:Ljava/lang/String; = "HmacSHA1"

.field private static HMAC_SHA1:Ljavax/crypto/Mac; = null


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    const-string v0, "HmacSHA1"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/MAC;->HMAC_SHA1:Ljavax/crypto/Mac;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    goto :goto_0

    .line 35
    :catch_0
    move-exception v1

    .line 38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 40
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized hmacsha1(Ljavax/crypto/spec/SecretKeySpec;[B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    const-class v1, Lorg/jivesoftware/smack/util/MAC;

    monitor-enter v1

    .line 44
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/util/MAC;->HMAC_SHA1:Ljavax/crypto/Mac;

    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 45
    sget-object v0, Lorg/jivesoftware/smack/util/MAC;->HMAC_SHA1:Ljavax/crypto/Mac;

    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->doFinal([B)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static hmacsha1([B[B)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .line 49
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HmacSHA1"

    invoke-direct {v1, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 50
    invoke-static {v1, p1}, Lorg/jivesoftware/smack/util/MAC;->hmacsha1(Ljavax/crypto/spec/SecretKeySpec;[B)[B

    move-result-object v0

    return-object v0
.end method
