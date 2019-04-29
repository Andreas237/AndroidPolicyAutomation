.class Lio/fabric/sdk/android/services/network/PinningTrustManager;
.super Ljava/lang/Object;
.source "PinningTrustManager.java"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# static fields
.field private static final PIN_FRESHNESS_DURATION_MILLIS:J = 0x39ef8b000L


# instance fields
.field private final cache:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field private final pinCreationTimeMillis:J

.field private final pins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private final systemKeyStore:Lio/fabric/sdk/android/services/network/SystemKeyStore;

.field private final systemTrustManagers:[Ljavax/net/ssl/TrustManager;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/network/SystemKeyStore;Lio/fabric/sdk/android/services/network/PinningInfoProvider;)V
    .locals 3

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pins:Ljava/util/List;

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->cache:Ljava/util/Set;

    .line 91
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/network/PinningTrustManager;->initializeSystemTrustManagers(Lio/fabric/sdk/android/services/network/SystemKeyStore;)[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    iput-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->systemTrustManagers:[Ljavax/net/ssl/TrustManager;

    .line 92
    iput-object p1, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->systemKeyStore:Lio/fabric/sdk/android/services/network/SystemKeyStore;

    .line 93
    invoke-interface {p2}, Lio/fabric/sdk/android/services/network/PinningInfoProvider;->getPinCreationTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pinCreationTimeMillis:J

    .line 95
    invoke-interface {p2}, Lio/fabric/sdk/android/services/network/PinningInfoProvider;->getPins()[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    array-length v0, p1

    :goto_0
    if-ge p2, v0, :cond_0

    aget-object v1, p1, p2

    .line 96
    iget-object v2, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pins:Ljava/util/List;

    invoke-direct {p0, v1}, Lio/fabric/sdk/android/services/network/PinningTrustManager;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private checkPinTrust([Ljava/security/cert/X509Certificate;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 141
    iget-wide v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pinCreationTimeMillis:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pinCreationTimeMillis:J

    sub-long v4, v0, v2

    const-wide v0, 0x39ef8b000L

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    .line 144
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object p1

    const-string v2, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Certificate pins are stale, ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pinCreationTimeMillis:J

    sub-long v8, v4, v6

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " millis vs "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " millis) "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "falling back to system trust."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lio/fabric/sdk/android/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 151
    :cond_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->systemKeyStore:Lio/fabric/sdk/android/services/network/SystemKeyStore;

    invoke-static {p1, v0}, Lio/fabric/sdk/android/services/network/CertificateChainCleaner;->getCleanChain([Ljava/security/cert/X509Certificate;Lio/fabric/sdk/android/services/network/SystemKeyStore;)[Ljava/security/cert/X509Certificate;

    move-result-object p1

    .line 154
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 155
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/network/PinningTrustManager;->isValidPin(Ljava/security/cert/X509Certificate;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 160
    :cond_2
    new-instance p1, Ljava/security/cert/CertificateException;

    const-string v0, "No valid pins found in chain!"

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private checkSystemTrust([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->systemTrustManagers:[Ljavax/net/ssl/TrustManager;

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 134
    check-cast v3, Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v3, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private hexStringToByteArray(Ljava/lang/String;)[B
    .locals 7

    .line 187
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 188
    div-int/lit8 v1, v0, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 191
    div-int/lit8 v3, v2, 0x2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    add-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private initializeSystemTrustManagers(Lio/fabric/sdk/android/services/network/SystemKeyStore;)[Ljavax/net/ssl/TrustManager;
    .locals 1

    :try_start_0
    const-string v0, "X509"

    .line 102
    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    .line 103
    iget-object p1, p1, Lio/fabric/sdk/android/services/network/SystemKeyStore;->trustStore:Ljava/security/KeyStore;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 105
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 109
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    .line 107
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method private isValidPin(Ljava/security/cert/X509Certificate;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    :try_start_0
    const-string v0, "SHA1"

    .line 115
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 116
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    invoke-interface {p1}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object p1

    .line 117
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    .line 119
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->pins:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 120
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :catch_0
    move-exception p1

    .line 127
    new-instance v0, Ljava/security/cert/CertificateException;

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 165
    new-instance p1, Ljava/security/cert/CertificateException;

    const-string p2, "Client certificates not supported!"

    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->cache:Ljava/util/Set;

    const/4 v1, 0x0

    aget-object v2, p1, v1

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 177
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/fabric/sdk/android/services/network/PinningTrustManager;->checkSystemTrust([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 178
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/network/PinningTrustManager;->checkPinTrust([Ljava/security/cert/X509Certificate;)V

    .line 179
    iget-object p2, p0, Lio/fabric/sdk/android/services/network/PinningTrustManager;->cache:Ljava/util/Set;

    aget-object p1, p1, v1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
