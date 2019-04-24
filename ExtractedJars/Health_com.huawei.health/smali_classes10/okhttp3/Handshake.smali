.class public final Lokhttp3/Handshake;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cipherSuite:Lokhttp3/CipherSuite;

.field private final localCertificates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/security/cert/Certificate;>;"
        }
    .end annotation
.end field

.field private final peerCertificates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/security/cert/Certificate;>;"
        }
    .end annotation
.end field

.field private final tlsVersion:Lokhttp3/TlsVersion;


# direct methods
.method private constructor <init>(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List<Ljava/security/cert/Certificate;>;Ljava/util/List<Ljava/security/cert/Certificate;>;)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lokhttp3/Handshake;->tlsVersion:Lokhttp3/TlsVersion;

    .line 43
    iput-object p2, p0, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    .line 44
    iput-object p3, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    .line 45
    iput-object p4, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    .line 46
    return-void
.end method

.method public static get(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;
    .locals 10

    .line 49
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v2

    .line 50
    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cipherSuite == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_0
    invoke-static {v2}, Lokhttp3/CipherSuite;->forJavaName(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v3

    .line 53
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v4

    .line 54
    if-nez v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "tlsVersion == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_1
    invoke-static {v4}, Lokhttp3/TlsVersion;->forJavaName(Ljava/lang/String;)Lokhttp3/TlsVersion;

    move-result-object v5

    .line 59
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 62
    goto :goto_0

    .line 60
    :catch_0
    move-exception v7

    .line 61
    const/4 v6, 0x0

    .line 63
    :goto_0
    if-eqz v6, :cond_2

    .line 64
    invoke-static {v6}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_1

    .line 65
    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 67
    :goto_1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v8

    .line 68
    if-eqz v8, :cond_3

    .line 69
    invoke-static {v8}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    goto :goto_2

    .line 70
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 72
    :goto_2
    new-instance v0, Lokhttp3/Handshake;

    invoke-direct {v0, v5, v3, v7, v9}, Lokhttp3/Handshake;-><init>(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static get(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List<Ljava/security/cert/Certificate;>;Ljava/util/List<Ljava/security/cert/Certificate;>;)Lokhttp3/Handshake;"
        }
    .end annotation

    .line 77
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cipherSuite == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    new-instance v0, Lokhttp3/Handshake;

    invoke-static {p2}, Lokhttp3/internal/Util;->immutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 79
    invoke-static {p3}, Lokhttp3/internal/Util;->immutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p0, p1, v1, v2}, Lokhttp3/Handshake;-><init>(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public cipherSuite()Lokhttp3/CipherSuite;
    .locals 1

    .line 92
    iget-object v0, p0, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 120
    instance-of v0, p1, Lokhttp3/Handshake;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 121
    :cond_0
    move-object v2, p1

    check-cast v2, Lokhttp3/Handshake;

    .line 122
    iget-object v0, p0, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    iget-object v1, v2, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    invoke-static {v0, v1}, Lokhttp3/internal/Util;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    iget-object v1, v2, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    .line 123
    invoke-virtual {v0, v1}, Lokhttp3/CipherSuite;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    iget-object v1, v2, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    .line 124
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    iget-object v1, v2, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    .line 125
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 129
    const/16 v2, 0x11

    .line 130
    iget-object v0, p0, Lokhttp3/Handshake;->tlsVersion:Lokhttp3/TlsVersion;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Handshake;->tlsVersion:Lokhttp3/TlsVersion;

    invoke-virtual {v0}, Lokhttp3/TlsVersion;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit16 v2, v0, 0x20f

    .line 131
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lokhttp3/Handshake;->cipherSuite:Lokhttp3/CipherSuite;

    invoke-virtual {v1}, Lokhttp3/CipherSuite;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 132
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 133
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 134
    return v2
.end method

.method public localCertificates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/security/cert/Certificate;>;"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    return-object v0
.end method

.method public localPrincipal()Ljava/security/Principal;
    .locals 2

    .line 114
    iget-object v0, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/Handshake;->localCertificates:Ljava/util/List;

    .line 115
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public peerCertificates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/security/cert/Certificate;>;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    return-object v0
.end method

.method public peerPrincipal()Ljava/security/Principal;
    .locals 2

    .line 102
    iget-object v0, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/Handshake;->peerCertificates:Ljava/util/List;

    .line 103
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public tlsVersion()Lokhttp3/TlsVersion;
    .locals 1

    .line 87
    iget-object v0, p0, Lokhttp3/Handshake;->tlsVersion:Lokhttp3/TlsVersion;

    return-object v0
.end method
