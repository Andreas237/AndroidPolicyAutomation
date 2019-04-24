.class public final Lokhttp3/internal/io/RealConnection;
.super Lokhttp3/internal/framed/FramedConnection$Listener;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Connection;


# instance fields
.field public allocationLimit:I

.field public final allocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/ref/Reference<Lokhttp3/internal/http/StreamAllocation;>;>;"
        }
    .end annotation
.end field

.field public volatile framedConnection:Lokhttp3/internal/framed/FramedConnection;

.field private handshake:Lokhttp3/Handshake;

.field public idleAtNanos:J

.field public noNewStreams:Z

.field private protocol:Lokhttp3/Protocol;

.field private rawSocket:Ljava/net/Socket;

.field private final route:Lokhttp3/Route;

.field public sink:Lokio/BufferedSink;

.field public socket:Ljava/net/Socket;

.field public source:Lokio/BufferedSource;

.field public successCount:I


# direct methods
.method public constructor <init>(Lokhttp3/Route;)V
    .locals 2

    .line 87
    invoke-direct {p0}, Lokhttp3/internal/framed/FramedConnection$Listener;-><init>()V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->allocations:Ljava/util/List;

    .line 85
    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lokhttp3/internal/io/RealConnection;->idleAtNanos:J

    .line 88
    iput-object p1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 89
    return-void
.end method

.method private connectSocket(IIILokhttp3/internal/ConnectionSpecSelector;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 140
    :try_start_0
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    iget-object v2, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v2}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/internal/Platform;->connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    goto :goto_0

    .line 141
    :catch_0
    move-exception v5

    .line 142
    new-instance v0, Ljava/net/ConnectException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to connect to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v2}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    invoke-static {v0}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    .line 145
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    invoke-static {v0}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    .line 147
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Address;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 148
    invoke-direct {p0, p2, p3, p4}, Lokhttp3/internal/io/RealConnection;->connectTls(IILokhttp3/internal/ConnectionSpecSelector;)V

    goto :goto_1

    .line 150
    :cond_0
    sget-object v0, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    .line 151
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    .line 154
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->SPDY_3:Lokhttp3/Protocol;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_2

    .line 155
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 157
    new-instance v0, Lokhttp3/internal/framed/FramedConnection$Builder;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lokhttp3/internal/framed/FramedConnection$Builder;-><init>(Z)V

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    iget-object v2, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 158
    invoke-virtual {v2}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    iget-object v4, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    invoke-virtual {v0, v1, v2, v3, v4}, Lokhttp3/internal/framed/FramedConnection$Builder;->socket(Ljava/net/Socket;Ljava/lang/String;Lokio/BufferedSource;Lokio/BufferedSink;)Lokhttp3/internal/framed/FramedConnection$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    .line 159
    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/FramedConnection$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/internal/framed/FramedConnection$Builder;

    move-result-object v0

    .line 160
    invoke-virtual {v0, p0}, Lokhttp3/internal/framed/FramedConnection$Builder;->listener(Lokhttp3/internal/framed/FramedConnection$Listener;)Lokhttp3/internal/framed/FramedConnection$Builder;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection$Builder;->build()Lokhttp3/internal/framed/FramedConnection;

    move-result-object v5

    .line 162
    invoke-virtual {v5}, Lokhttp3/internal/framed/FramedConnection;->sendConnectionPreface()V

    .line 165
    invoke-virtual {v5}, Lokhttp3/internal/framed/FramedConnection;->maxConcurrentStreams()I

    move-result v0

    iput v0, p0, Lokhttp3/internal/io/RealConnection;->allocationLimit:I

    .line 166
    iput-object v5, p0, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    .line 167
    goto :goto_2

    .line 168
    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lokhttp3/internal/io/RealConnection;->allocationLimit:I

    .line 170
    :goto_2
    return-void
.end method

.method private connectTls(IILokhttp3/internal/ConnectionSpecSelector;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->requiresTunnel()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/io/RealConnection;->createTunnel(II)V

    .line 178
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v4

    .line 179
    invoke-virtual {v4}, Lokhttp3/Address;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v5

    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v7, 0x0

    .line 184
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    .line 185
    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->port()I

    move-result v2

    .line 184
    const/4 v3, 0x1

    invoke-virtual {v5, v0, v1, v2, v3}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    move-object v7, v0

    .line 188
    invoke-virtual {p3, v7}, Lokhttp3/internal/ConnectionSpecSelector;->configureSecureSocket(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;

    move-result-object v8

    .line 189
    invoke-virtual {v8}, Lokhttp3/ConnectionSpec;->supportsTlsExtensions()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    .line 191
    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lokhttp3/Address;->protocols()Ljava/util/List;

    move-result-object v2

    .line 190
    invoke-virtual {v0, v7, v1, v2}, Lokhttp3/internal/Platform;->configureTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 195
    :cond_1
    invoke-virtual {v7}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 196
    invoke-virtual {v7}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/Handshake;->get(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;

    move-result-object v9

    .line 199
    invoke-virtual {v4}, Lokhttp3/Address;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 200
    invoke-virtual {v9}, Lokhttp3/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/security/cert/X509Certificate;

    .line 201
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hostname "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not verified:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n    certificate: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 202
    invoke-static {v10}, Lokhttp3/CertificatePinner;->pin(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n    DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 203
    invoke-virtual {v10}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n    subjectAltNames: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 204
    invoke-static {v10}, Lokhttp3/internal/tls/OkHostnameVerifier;->allSubjectAltNames(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_2
    invoke-virtual {v4}, Lokhttp3/Address;->certificatePinner()Lokhttp3/CertificatePinner;

    move-result-object v0

    invoke-virtual {v4}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    .line 209
    invoke-virtual {v9}, Lokhttp3/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v2

    .line 208
    invoke-virtual {v0, v1, v2}, Lokhttp3/CertificatePinner;->check(Ljava/lang/String;Ljava/util/List;)V

    .line 212
    invoke-virtual {v8}, Lokhttp3/ConnectionSpec;->supportsTlsExtensions()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    invoke-virtual {v0, v7}, Lokhttp3/internal/Platform;->getSelectedProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    .line 215
    :goto_0
    iput-object v7, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    .line 216
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-static {v0}, Lokio/Okio;->source(Ljava/net/Socket;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    .line 217
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-static {v0}, Lokio/Okio;->sink(Ljava/net/Socket;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    .line 218
    iput-object v9, p0, Lokhttp3/internal/io/RealConnection;->handshake:Lokhttp3/Handshake;

    .line 219
    if-eqz v10, :cond_4

    .line 220
    invoke-static {v10}, Lokhttp3/Protocol;->get(Ljava/lang/String;)Lokhttp3/Protocol;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v0, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    :goto_1
    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    const/4 v6, 0x1

    .line 227
    if-eqz v7, :cond_5

    .line 228
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    invoke-virtual {v0, v7}, Lokhttp3/internal/Platform;->afterHandshake(Ljavax/net/ssl/SSLSocket;)V

    .line 230
    :cond_5
    goto :goto_2

    .line 223
    .line 231
    :catch_0
    move-exception v8

    .line 224
    :try_start_1
    invoke-static {v8}, Lokhttp3/internal/Util;->isAndroidGetsocknameError(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 225
    :cond_6
    throw v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    :catchall_0
    move-exception v11

    if-eqz v7, :cond_7

    .line 228
    invoke-static {}, Lokhttp3/internal/Platform;->get()Lokhttp3/internal/Platform;

    move-result-object v0

    invoke-virtual {v0, v7}, Lokhttp3/internal/Platform;->afterHandshake(Ljavax/net/ssl/SSLSocket;)V

    .line 230
    :cond_7
    if-nez v6, :cond_8

    .line 231
    invoke-static {v7}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    :cond_8
    throw v11

    .line 234
    :goto_2
    return-void
.end method

.method private createTunnel(II)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 242
    invoke-direct {p0}, Lokhttp3/internal/io/RealConnection;->createTunnelRequest()Lokhttp3/Request;

    move-result-object v4

    .line 243
    invoke-virtual {v4}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v5

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v5, v1}, Lokhttp3/internal/Util;->hostHeader(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " HTTP/1.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 246
    :goto_0
    new-instance v7, Lokhttp3/internal/http/Http1xStream;

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    const/4 v2, 0x0

    invoke-direct {v7, v2, v0, v1}, Lokhttp3/internal/http/Http1xStream;-><init>(Lokhttp3/internal/http/StreamAllocation;Lokio/BufferedSource;Lokio/BufferedSink;)V

    .line 247
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->timeout()Lokio/Timeout;

    move-result-object v0

    int-to-long v1, p1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 248
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->timeout()Lokio/Timeout;

    move-result-object v0

    int-to-long v1, p2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 249
    invoke-virtual {v4}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v7, v0, v6}, Lokhttp3/internal/http/Http1xStream;->writeRequest(Lokhttp3/Headers;Ljava/lang/String;)V

    .line 250
    invoke-virtual {v7}, Lokhttp3/internal/http/Http1xStream;->finishRequest()V

    .line 251
    invoke-virtual {v7}, Lokhttp3/internal/http/Http1xStream;->readResponse()Lokhttp3/Response$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v8

    .line 254
    invoke-static {v8}, Lokhttp3/internal/http/OkHeaders;->contentLength(Lokhttp3/Response;)J

    move-result-wide v9

    .line 255
    const-wide/16 v0, -0x1

    cmp-long v0, v9, v0

    if-nez v0, :cond_0

    .line 256
    const-wide/16 v9, 0x0

    .line 258
    :cond_0
    invoke-virtual {v7, v9, v10}, Lokhttp3/internal/http/Http1xStream;->newFixedLengthSource(J)Lokio/Source;

    move-result-object v11

    .line 259
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const v1, 0x7fffffff

    invoke-static {v11, v1, v0}, Lokhttp3/internal/Util;->skipAll(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z

    .line 260
    invoke-interface {v11}, Lokio/Source;->close()V

    .line 262
    invoke-virtual {v8}, Lokhttp3/Response;->code()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 268
    :sswitch_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->exhausted()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->exhausted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 269
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TLS tunnel buffered too many bytes!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_2
    return-void

    .line 274
    :sswitch_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Address;->proxyAuthenticator()Lokhttp3/Authenticator;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-interface {v0, v1, v8}, Lokhttp3/Authenticator;->authenticate(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    move-result-object v4

    .line 275
    if-eqz v4, :cond_3

    goto/16 :goto_0

    .line 276
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to authenticate with proxy"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 279
    :goto_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected response code for CONNECT: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 280
    invoke-virtual {v8}, Lokhttp3/Response;->code()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x197 -> :sswitch_1
    .end sparse-switch
.end method

.method private createTunnelRequest()Lokhttp3/Request;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 292
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 293
    invoke-virtual {v1}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Host"

    iget-object v2, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 294
    invoke-virtual {v2}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lokhttp3/internal/Util;->hostHeader(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    .line 295
    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "User-Agent"

    .line 296
    invoke-static {}, Lokhttp3/internal/Version;->userAgent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 297
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 311
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 312
    return-void
.end method

.method public connect(IIILjava/util/List;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/util/List<Lokhttp3/ConnectionSpec;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lokhttp3/internal/http/RouteException;
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    const/4 v4, 0x0

    .line 96
    new-instance v5, Lokhttp3/internal/ConnectionSpecSelector;

    invoke-direct {v5, p4}, Lokhttp3/internal/ConnectionSpecSelector;-><init>(Ljava/util/List;)V

    .line 97
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->proxy()Ljava/net/Proxy;

    move-result-object v6

    .line 98
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v7

    .line 100
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v0}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Address;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lokhttp3/ConnectionSpec;->CLEARTEXT:Lokhttp3/ConnectionSpec;

    .line 101
    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    new-instance v0, Lokhttp3/internal/http/RouteException;

    new-instance v1, Ljava/net/UnknownServiceException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CLEARTEXT communication not supported: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lokhttp3/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 106
    :cond_1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    if-nez v0, :cond_7

    .line 108
    :try_start_0
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_2

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_3

    .line 109
    :cond_2
    invoke-virtual {v7}, Lokhttp3/Address;->socketFactory()Ljavax/net/SocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v6}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    :goto_1
    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    .line 111
    invoke-direct {p0, p1, p2, p3, v5}, Lokhttp3/internal/io/RealConnection;->connectSocket(IIILokhttp3/internal/ConnectionSpecSelector;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 112
    :catch_0
    move-exception v8

    .line 113
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 114
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    invoke-static {v0}, Lokhttp3/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->rawSocket:Ljava/net/Socket;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->sink:Lokio/BufferedSink;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->handshake:Lokhttp3/Handshake;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    .line 122
    if-nez v4, :cond_4

    .line 123
    new-instance v4, Lokhttp3/internal/http/RouteException;

    invoke-direct {v4, v8}, Lokhttp3/internal/http/RouteException;-><init>(Ljava/io/IOException;)V

    goto :goto_2

    .line 125
    :cond_4
    invoke-virtual {v4, v8}, Lokhttp3/internal/http/RouteException;->addConnectException(Ljava/io/IOException;)V

    .line 128
    :goto_2
    if-eqz p5, :cond_5

    invoke-virtual {v5, v8}, Lokhttp3/internal/ConnectionSpecSelector;->connectionFailed(Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 129
    :cond_5
    throw v4

    .line 131
    :cond_6
    goto/16 :goto_0

    .line 133
    :cond_7
    return-void
.end method

.method public handshake()Lokhttp3/Handshake;
    .locals 1

    .line 361
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->handshake:Lokhttp3/Handshake;

    return-object v0
.end method

.method isConnected()Z
    .locals 1

    .line 302
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isHealthy(Z)Z
    .locals 5

    .line 320
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 324
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    if-eqz v0, :cond_2

    .line 325
    const/4 v0, 0x1

    return v0

    .line 328
    :cond_2
    if-eqz p1, :cond_4

    .line 330
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    .line 332
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 333
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->exhausted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 334
    const/4 v3, 0x0

    .line 338
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return v3

    .line 336
    :cond_3
    const/4 v3, 0x1

    .line 338
    :try_start_3
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    return v3

    :catchall_0
    move-exception v4

    :try_start_4
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v4
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 340
    :catch_0
    move-exception v2

    .line 344
    goto :goto_0

    .line 342
    :catch_1
    move-exception v2

    .line 343
    const/4 v0, 0x0

    return v0

    .line 347
    :cond_4
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isMultiplexed()Z
    .locals 1

    .line 369
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onSettings(Lokhttp3/internal/framed/FramedConnection;)V
    .locals 1

    .line 357
    invoke-virtual {p1}, Lokhttp3/internal/framed/FramedConnection;->maxConcurrentStreams()I

    move-result v0

    iput v0, p0, Lokhttp3/internal/io/RealConnection;->allocationLimit:I

    .line 358
    return-void
.end method

.method public onStream(Lokhttp3/internal/framed/FramedStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 352
    sget-object v0, Lokhttp3/internal/framed/ErrorCode;->REFUSED_STREAM:Lokhttp3/internal/framed/ErrorCode;

    invoke-virtual {p1, v0}, Lokhttp3/internal/framed/FramedStream;->close(Lokhttp3/internal/framed/ErrorCode;)V

    .line 353
    return-void
.end method

.method public protocol()Lokhttp3/Protocol;
    .locals 1

    .line 373
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    if-nez v0, :cond_1

    .line 374
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    goto :goto_0

    :cond_0
    sget-object v0, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    :goto_0
    return-object v0

    .line 376
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection;->getProtocol()Lokhttp3/Protocol;

    move-result-object v0

    return-object v0
.end method

.method public route()Lokhttp3/Route;
    .locals 1

    .line 306
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    return-object v0
.end method

.method public socket()Ljava/net/Socket;
    .locals 1

    .line 315
    iget-object v0, p0, Lokhttp3/internal/io/RealConnection;->socket:Ljava/net/Socket;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 382
    invoke-virtual {v1}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    invoke-virtual {v1}, Lokhttp3/Route;->address()Lokhttp3/Address;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Address;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->port()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 384
    invoke-virtual {v1}, Lokhttp3/Route;->proxy()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->route:Lokhttp3/Route;

    .line 386
    invoke-virtual {v1}, Lokhttp3/Route;->socketAddress()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->handshake:Lokhttp3/Handshake;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->handshake:Lokhttp3/Handshake;

    .line 388
    invoke-virtual {v1}, Lokhttp3/Handshake;->cipherSuite()Lokhttp3/CipherSuite;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/io/RealConnection;->protocol:Lokhttp3/Protocol;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
