.class public Lcom/ibotta/android/security/crypto/salt/DefaultSalt;
.super Ljava/lang/Object;
.source "DefaultSalt.java"

# interfaces
.implements Lcom/ibotta/android/security/crypto/salt/Salt;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private get()Ljava/lang/String;
    .locals 3

    const/16 v0, 0x12

    .line 31
    new-array v0, v0, [C

    fill-array-data v0, :array_0

    .line 36
    new-instance v1, Lcom/ibotta/android/security/crypto/Enigma;

    invoke-direct {v1}, Lcom/ibotta/android/security/crypto/Enigma;-><init>()V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/security/crypto/Enigma;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 2
        0x34s
        0x40s
        0x3es
        0x5ds
        0x3as
        0x33s
        0x40s
        0x45s
        0x45s
        0x32s
        0x5ds
        0x32s
        0x3fs
        0x35s
        0x43s
        0x40s
        0x3as
        0x35s
    .end array-data
.end method


# virtual methods
.method public getSalt()[C
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "SHA-256"

    .line 17
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/security/crypto/salt/DefaultSalt;->get()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UTF-8"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->update([B)V

    const/16 v2, 0x20

    .line 19
    new-array v2, v2, [B

    .line 20
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    array-length v3, v2

    invoke-static {v1, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    new-instance v1, Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 23
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Failed to produce salt."

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Failed to produce salt."

    invoke-direct {v0, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
