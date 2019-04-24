.class public Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# instance fields
.field private delegate:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLContext;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 20
    invoke-virtual {p1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    .line 21
    return-void
.end method

.method static enableTlsVersion(Ljava/net/Socket;)V
    .locals 4

    .line 100
    if-eqz p0, :cond_0

    instance-of v0, p0, Ljavax/net/ssl/SSLSocket;

    if-nez v0, :cond_1

    .line 101
    :cond_0
    return-void

    .line 103
    :cond_1
    move-object v3, p0

    check-cast v3, Ljavax/net/ssl/SSLSocket;

    .line 106
    if-eqz v3, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 107
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TLSv1.1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "TLSv1.2"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 110
    :cond_2
    return-void
.end method

.method public static filterCipherSuites([Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    .line 72
    if-nez p0, :cond_0

    .line 73
    return-object p0

    .line 76
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 77
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 79
    const-string v0, "RC4"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DES"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "3DES"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "aNULL"

    .line 80
    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "eNULL"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_2
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method static filterSSLSocketCipherSuites(Ljava/net/Socket;)V
    .locals 2

    .line 59
    if-eqz p0, :cond_0

    instance-of v0, p0, Ljavax/net/ssl/SSLSocket;

    if-nez v0, :cond_1

    .line 60
    :cond_0
    return-void

    .line 62
    :cond_1
    move-object v1, p0

    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 64
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterCipherSuites([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 65
    return-void
.end method


# virtual methods
.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v1

    .line 40
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterSSLSocketCipherSuites(Ljava/net/Socket;)V

    .line 41
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->enableTlsVersion(Ljava/net/Socket;)V

    .line 42
    return-object v1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 31
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterSSLSocketCipherSuites(Ljava/net/Socket;)V

    .line 32
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->enableTlsVersion(Ljava/net/Socket;)V

    .line 33
    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 116
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterSSLSocketCipherSuites(Ljava/net/Socket;)V

    .line 117
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->enableTlsVersion(Ljava/net/Socket;)V

    .line 118
    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 91
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterSSLSocketCipherSuites(Ljava/net/Socket;)V

    .line 92
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->enableTlsVersion(Ljava/net/Socket;)V

    .line 93
    return-object v1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    .line 53
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterSSLSocketCipherSuites(Ljava/net/Socket;)V

    .line 54
    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->enableTlsVersion(Ljava/net/Socket;)V

    .line 55
    return-object v1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getDefaultCipherSuites()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterCipherSuites([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->delegate:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->filterCipherSuites([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
