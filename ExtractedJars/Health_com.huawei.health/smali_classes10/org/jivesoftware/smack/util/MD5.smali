.class public Lorg/jivesoftware/smack/util/MD5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static MD5_DIGEST:Ljava/security/MessageDigest;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/MD5;->MD5_DIGEST:Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_0

    .line 33
    :catch_0
    move-exception v1

    .line 36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 38
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytes(Ljava/lang/String;)[B
    .locals 1

    .line 45
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->toBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/MD5;->bytes([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized bytes([B)[B
    .locals 2

    const-class v1, Lorg/jivesoftware/smack/util/MD5;

    monitor-enter v1

    .line 41
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/util/MD5;->MD5_DIGEST:Ljava/security/MessageDigest;

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
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

.method public static hex(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 53
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->toBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/MD5;->hex([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static hex([B)Ljava/lang/String;
    .locals 1

    .line 49
    invoke-static {p0}, Lorg/jivesoftware/smack/util/MD5;->bytes([B)[B

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/StringUtils;->encodeHex([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
