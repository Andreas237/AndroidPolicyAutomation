.class public Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;
.super Ljava/lang/Object;
.source "DefaultKeyProvider.java"

# interfaces
.implements Lcom/ibotta/android/security/crypto/key/KeyProvider;


# static fields
.field private static final DEFAULT_KEY:[C


# instance fields
.field private obfuscatedKey:[C

.field private final salt:Lcom/ibotta/android/security/crypto/salt/DefaultSalt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    .line 10
    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->DEFAULT_KEY:[C

    return-void

    :array_0
    .array-data 2
        0x49s
        0x62s
        0x30s
        0x37s
        0x37s
        0x61s
        0x23s
        0x32s
        0x30s
        0x31s
        0x32s
        0x2as
        0x43s
        0x34s
        0x35s
        0x68s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->DEFAULT_KEY:[C

    invoke-direct {p0, v0}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;-><init>([C)V

    return-void
.end method

.method public constructor <init>([C)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Lcom/ibotta/android/security/crypto/salt/DefaultSalt;

    invoke-direct {v0}, Lcom/ibotta/android/security/crypto/salt/DefaultSalt;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->salt:Lcom/ibotta/android/security/crypto/salt/DefaultSalt;

    .line 22
    invoke-virtual {p0, p1}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->setObfuscatedKey([C)V

    return-void
.end method

.method public static dumpObfuscatedKey(Ljava/lang/String;)V
    .locals 7

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    .line 56
    new-instance v0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;

    invoke-direct {v0, p0}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;-><init>([C)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->getKey()[C

    move-result-object p0

    .line 58
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-char v4, p0, v3

    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "0x"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p0, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getKey()[C
    .locals 6

    const/4 v0, 0x0

    .line 34
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->salt:Lcom/ibotta/android/security/crypto/salt/DefaultSalt;

    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/salt/DefaultSalt;->getSalt()[C

    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->obfuscatedKey:[C

    array-length v2, v2

    new-array v2, v2, [C

    const/4 v3, 0x0

    .line 37
    :goto_0
    iget-object v4, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->obfuscatedKey:[C

    array-length v4, v4

    if-ge v3, v4, :cond_0

    .line 38
    array-length v4, v1

    rem-int v4, v3, v4

    .line 39
    iget-object v5, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->obfuscatedKey:[C

    aget-char v5, v5, v3

    aget-char v4, v1, v4

    xor-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    :catch_0
    move-exception v1

    .line 42
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Failed to produce obfuscatedKey."

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Failed to produce obfuscatedKey."

    invoke-direct {v0, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getKeyString()Ljava/lang/String;
    .locals 2

    .line 51
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->getKey()[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public setObfuscatedKey([C)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;->obfuscatedKey:[C

    return-void
.end method
