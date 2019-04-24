.class public final Lo/fsm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fsm$e;
    }
.end annotation


# direct methods
.method public static final b([BLo/fsm$e;[B)[B
    .locals 2

    .line 102
    invoke-virtual {p1}, Lo/fsm$e;->d()[B

    move-result-object v0

    invoke-virtual {p1}, Lo/fsm$e;->b()I

    move-result v1

    invoke-static {p0, v0, p2, v1}, Lo/fsm;->c([B[B[BI)[B

    move-result-object v0

    return-object v0
.end method

.method static c([B[B[BI)[B
    .locals 6

    .line 78
    const-string v0, "HmacSHA256"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v5

    .line 79
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "MAC"

    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v5, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 80
    invoke-static {p1, p2}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    invoke-static {v5, v0, p3}, Lo/fsm;->e(Ljavax/crypto/Mac;[BI)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 81
    :catch_0
    move-exception v5

    .line 83
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MAC algorithm %s is not available on JVM"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "HmacSHA256"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 84
    :catch_1
    move-exception v5

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot run Pseudo Random Function with invalid key"

    invoke-direct {v0, v1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static final e(Ljavax/crypto/Mac;[BI)[B
    .locals 8

    .line 122
    int-to-double v0, p2

    invoke-virtual {p0}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 123
    const/4 v0, 0x0

    new-array v5, v0, [B

    .line 125
    move-object v6, p1

    .line 126
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_0

    .line 127
    invoke-virtual {p0, v6}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v6

    .line 128
    invoke-static {v6, p1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    invoke-static {v5, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v5

    .line 126
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 131
    :cond_0
    invoke-static {v5, p2}, Lo/fsp;->e([BI)[B

    move-result-object v0

    return-object v0
.end method
