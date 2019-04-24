.class public Lo/dsj;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# static fields
.field private static final c:[Ljava/lang/String;


# instance fields
.field private final d:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TLSv1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "TLSv1.1"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "TLSv1.2"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/dsj;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 21
    iput-object p1, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    .line 22
    return-void
.end method

.method private a(Ljava/net/Socket;)Ljava/net/Socket;
    .locals 3

    .line 75
    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 76
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    sget-object v1, Lo/dsj;->c:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljavax/net/ssl/SSLSocketFactory;)[Ljava/lang/String;

    move-result-object v2

    .line 78
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-virtual {v0, v2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 80
    :cond_0
    return-object p1
.end method

.method private a(Ljavax/net/ssl/SSLSocketFactory;)[Ljava/lang/String;
    .locals 4

    .line 83
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocketFactory;->getDefaultCipherSuites()[Ljava/lang/String;

    move-result-object v2

    .line 84
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 86
    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 87
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljavax/net/ssl/SSLSocketFactory;)[Ljava/lang/String;
    .locals 4

    .line 91
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocketFactory;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v2

    .line 92
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 94
    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 45
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljava/net/Socket;)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljava/net/Socket;)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    .line 55
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljava/net/Socket;)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    .line 63
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 69
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljava/net/Socket;)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    .line 71
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 37
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljava/net/Socket;)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    .line 39
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-direct {p0, v0}, Lo/dsj;->a(Ljavax/net/ssl/SSLSocketFactory;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dsj;->d:Ljavax/net/ssl/SSLSocketFactory;

    invoke-direct {p0, v0}, Lo/dsj;->e(Ljavax/net/ssl/SSLSocketFactory;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
