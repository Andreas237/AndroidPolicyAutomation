.class public Lo/fpw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:J


# instance fields
.field private a:Ljavax/crypto/spec/SecretKeySpec;

.field private b:J

.field c:[B

.field private final e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private h:Ljavax/crypto/Mac;

.field private final k:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lo/fpw;->d:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 73
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Lo/fpw;->k:Ljava/security/SecureRandom;

    .line 74
    const/16 v0, 0x20

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fpw;->c:[B

    return-void
.end method

.method private a()Ljavax/crypto/Mac;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 113
    :try_start_0
    iget-object v0, p0, Lo/fpw;->a:Ljavax/crypto/spec/SecretKeySpec;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/fpw;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    invoke-direct {p0}, Lo/fpw;->c()Ljavax/crypto/Mac;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 117
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-object v2

    :cond_0
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 118
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v3

    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw v3

    .line 121
    :goto_0
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 125
    :try_start_1
    iget-object v0, p0, Lo/fpw;->a:Ljavax/crypto/spec/SecretKeySpec;

    if-nez v0, :cond_1

    .line 127
    invoke-direct {p0}, Lo/fpw;->e()V

    .line 128
    const-string v0, "HmacSHA256"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    iput-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    .line 129
    iget-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    iget-object v1, p0, Lo/fpw;->a:Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 130
    iget-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljavax/crypto/Mac;
    :try_end_1
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-object v2

    .line 131
    :cond_1
    :try_start_2
    invoke-direct {p0}, Lo/fpw;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    invoke-direct {p0}, Lo/fpw;->e()V

    .line 134
    :cond_2
    invoke-direct {p0}, Lo/fpw;->c()Ljavax/crypto/Mac;
    :try_end_2
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 141
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-object v2

    .line 135
    :catch_0
    move-exception v2

    .line 137
    :try_start_3
    iget-object v3, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    move-object v4, v3

    .line 141
    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-object v4

    :catchall_1
    move-exception v5

    iget-object v0, p0, Lo/fpw;->e:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw v5
.end method

.method private final c()Ljavax/crypto/Mac;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    if-eqz v0, :cond_0

    .line 93
    :try_start_0
    iget-object v0, p0, Lo/fpw;->h:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 94
    :catch_0
    move-exception v2

    .line 95
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "hmac doesn\'t support clone and MUST therefore be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_0
    const-string v0, "HmacSHA256"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v2

    .line 100
    iget-object v0, p0, Lo/fpw;->a:Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v2, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 101
    return-object v2
.end method

.method private d()Z
    .locals 4

    .line 154
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/fpw;->b:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()V
    .locals 4

    .line 165
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-wide v2, Lo/fpw;->d:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/fpw;->b:J

    .line 166
    iget-object v0, p0, Lo/fpw;->k:Ljava/security/SecureRandom;

    iget-object v1, p0, Lo/fpw;->c:[B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 167
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lo/fpw;->c:[B

    const-string v2, "MAC"

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lo/fpw;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 168
    return-void
.end method


# virtual methods
.method public a(Lo/fql;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 186
    invoke-direct {p0}, Lo/fpw;->a()Ljavax/crypto/Mac;

    move-result-object v1

    .line 188
    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 190
    invoke-virtual {p1}, Lo/fql;->i()Lo/frn;

    move-result-object v0

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update(B)V

    .line 191
    invoke-virtual {p1}, Lo/fql;->i()Lo/frn;

    move-result-object v0

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update(B)V

    .line 192
    invoke-virtual {p1}, Lo/fql;->f()Lo/fro;

    move-result-object v0

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 193
    invoke-virtual {p1}, Lo/fql;->k()Lo/fsa;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsa;->b()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 194
    invoke-virtual {p1}, Lo/fql;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fsf;->b(Ljava/util/List;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 195
    invoke-virtual {p1}, Lo/fql;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fqh;->e(Ljava/util/List;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 196
    invoke-virtual {v1}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    return-object v0
.end method
