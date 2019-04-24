.class public Lo/cxt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cxt;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 110
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 112
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v2

    .line 113
    mul-int/lit8 v0, p0, 0x8

    invoke-virtual {v2, v0, v1}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V

    .line 114
    invoke-virtual {v2}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v3

    .line 115
    invoke-interface {v3}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public static c(I[B[B[B)[B
    .locals 4

    .line 46
    sget-object v1, Lo/cxt;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 47
    const/4 v2, 0x0

    .line 48
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 50
    :sswitch_0
    :try_start_0
    new-instance v2, Lo/cxm;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lo/cxm;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 56
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 57
    monitor-exit v1

    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    :try_start_1
    invoke-virtual {v2, p1, p2, p3}, Lo/cxu;->d([B[B[B)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 61
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c([B)[B
    .locals 7

    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    const/16 v0, 0x10

    new-array v5, v0, [B

    .line 77
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 78
    invoke-virtual {v3, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 79
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 80
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v4, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 81
    :catch_0
    move-exception v6

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 84
    :goto_0
    return-object v5
.end method

.method public static d(I[B[B[B)[B
    .locals 4

    .line 27
    sget-object v1, Lo/cxt;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 28
    const/4 v2, 0x0

    .line 29
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 31
    :sswitch_0
    :try_start_0
    new-instance v2, Lo/cxm;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lo/cxm;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 37
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 38
    monitor-exit v1

    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_0
    :try_start_1
    invoke-virtual {v2, p1, p2, p3}, Lo/cxu;->a([B[B[B)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 42
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static d([B[B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .line 94
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 95
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 98
    :cond_1
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HMACSHA256"

    invoke-direct {v1, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 99
    const-string v0, "HmacSHA256"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v2

    .line 100
    invoke-virtual {v2, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 101
    invoke-virtual {v2, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method
