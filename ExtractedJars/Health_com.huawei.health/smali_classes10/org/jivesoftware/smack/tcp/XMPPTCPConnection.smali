.class public Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;
.super Lorg/jivesoftware/smack/AbstractXMPPConnection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;,
        Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;
    }
.end annotation


# static fields
.field private static final QUEUE_SIZE:I = 0x1f4

.field private static final TAG:Ljava/lang/String; = "XMPPTCPConnection"


# instance fields
.field private final config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

.field private final initalOpenStreamSend:Lorg/jivesoftware/smack/SynchronizationPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/SynchronizationPoint<Ljava/lang/Exception;>;"
        }
    .end annotation
.end field

.field protected packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

.field protected packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

.field private secureSocket:Ljavax/net/ssl/SSLSocket;

.field private socket:Ljava/net/Socket;

.field private uid:J


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;)V
    .locals 2

    .line 124
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;-><init>(Lorg/jivesoftware/smack/ConnectionConfiguration;)V

    .line 109
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint;

    const-string v1, "initial open stream element send to server"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/SynchronizationPoint;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initalOpenStreamSend:Lorg/jivesoftware/smack/SynchronizationPoint;

    .line 125
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    .line 128
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->createLogger()Lorg/jivesoftware/smack/android/SmackLogger;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/android/LogXS;->setSmackLogger(Lorg/jivesoftware/smack/android/SmackLogger;)V

    .line 129
    return-void
.end method

.method static synthetic access$1000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SASLAuthentication;
    .locals 1

    .line 83
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getSASLAuthentication()Lorg/jivesoftware/smack/SASLAuthentication;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 83
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    return-void
.end method

.method static synthetic access$1300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/Exception;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->notifyConnectionError(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$1400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/Exception;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->handleStreamError(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$1600(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$1700(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$1800(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$1900(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0

    .line 83
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->firePacketSendingListeners(Lorg/jivesoftware/smack/packet/Stanza;)V

    return-void
.end method

.method static synthetic access$2000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$2100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$2200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->isQuitConnection:Z

    return v0
.end method

.method static synthetic access$2300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$2400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$2500(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method static synthetic access$300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initalOpenStreamSend:Lorg/jivesoftware/smack/SynchronizationPoint;

    return-object v0
.end method

.method static synthetic access$400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 83
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->parseAndProcessStanza(Lorg/xmlpull/v1/XmlPullParser;)V

    return-void
.end method

.method static synthetic access$502(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 83
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->streamId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    return-object v0
.end method

.method static synthetic access$700(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    return-object v0
.end method

.method static synthetic access$800(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    return-object v0
.end method

.method static synthetic access$900(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SASLAuthentication;
    .locals 1

    .line 83
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getSASLAuthentication()Lorg/jivesoftware/smack/SASLAuthentication;

    move-result-object v0

    return-object v0
.end method

.method private connectUsingSSLSocket()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 232
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v3

    .line 233
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getCustomX509TrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v4

    .line 234
    if-nez v4, :cond_0

    .line 236
    new-instance v0, Ljava/security/cert/CertificateException;

    const-string v1, "SNS must use custom TrustManager"

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 240
    new-instance v0, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;

    invoke-direct {v0, v3}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;-><init>(Ljavax/net/ssl/SSLContext;)V

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getHost()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getPort()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/jivesoftware/smack/tcp/DefaultSSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    .line 242
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 243
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/net/Socket;->setSoLinger(ZI)V

    .line 245
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    move-object v5, v0

    check-cast v5, Ljavax/net/ssl/SSLSocket;

    .line 246
    const-string v0, "XMPPTCPConnection"

    const-string v1, "before Handshake"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    invoke-virtual {v5}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 249
    const-string v0, "XMPPTCPConnection"

    const-string v1, "after Handshake"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getConfiguration()Lorg/jivesoftware/smack/ConnectionConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v6

    .line 251
    if-nez v6, :cond_2

    .line 252
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No HostnameVerifier set. Use connectionConfiguration.setHostnameVerifier() to configure."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 254
    :cond_2
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 255
    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hostname verification of certificate failed. Certificate does not authenticate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 257
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 260
    :cond_3
    iput-object v5, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->secureSocket:Ljavax/net/ssl/SSLSocket;

    .line 261
    return-void
.end method

.method private handleStreamError(Ljava/lang/Exception;)V
    .locals 4

    .line 822
    instance-of v0, p1, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    if-eqz v0, :cond_1

    .line 823
    move-object v2, p1

    check-cast v2, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    .line 824
    invoke-virtual {v2}, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;->getStreamError()Lorg/jivesoftware/smack/packet/StreamError;

    move-result-object v3

    .line 825
    if-eqz v3, :cond_1

    .line 826
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->see_other_host:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    invoke-virtual {v3}, Lorg/jivesoftware/smack/packet/StreamError;->getCondition()Lorg/jivesoftware/smack/packet/StreamError$Condition;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 827
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    new-instance v1, Lorg/jivesoftware/smack/SmackException$SeeOtherHostException;

    invoke-direct {v1}, Lorg/jivesoftware/smack/SmackException$SeeOtherHostException;-><init>()V

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportFailure(Ljava/lang/Exception;)V

    goto :goto_0

    .line 828
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    invoke-virtual {v3}, Lorg/jivesoftware/smack/packet/StreamError;->getCondition()Lorg/jivesoftware/smack/packet/StreamError$Condition;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 830
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getSASLAuthentication()Lorg/jivesoftware/smack/SASLAuthentication;

    move-result-object v0

    new-instance v1, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    invoke-direct {v1, v3}, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;-><init>(Lorg/jivesoftware/smack/packet/StreamError;)V

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationFailed(Ljava/lang/Exception;)V

    .line 834
    :cond_1
    :goto_0
    return-void
.end method

.method private initConnection()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 272
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    if-nez v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 275
    :goto_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initReaderAndWriter()V

    .line 276
    if-eqz v2, :cond_2

    .line 277
    new-instance v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;-><init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    .line 278
    new-instance v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;-><init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    .line 282
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->isDebuggerEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    invoke-interface {v0}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->getReaderListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->addAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 284
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    invoke-interface {v0}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->getWriterListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 285
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    invoke-interface {v0}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->getWriterListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->addPacketSendingListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 290
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->init()V

    .line 293
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->init()V

    .line 294
    return-void
.end method

.method private initReaderAndWriter()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 297
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    .line 298
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    .line 301
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    .line 302
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    const-string v2, "UTF-8"

    invoke-direct {v1, v3, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->reader:Ljava/io/Reader;

    .line 305
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initDebugger()V

    .line 306
    return-void
.end method

.method private declared-synchronized notifyConnectionError(Ljava/lang/Exception;)V
    .locals 1

    monitor-enter p0

    .line 352
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->access$000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    .line 353
    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->access$100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    monitor-exit p0

    return-void

    .line 358
    :cond_2
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->instantShutdown()V

    .line 361
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->callConnectionClosedOnErrorListener(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private shutdown(Z)V
    .locals 4

    .line 184
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    if-eqz v0, :cond_0

    .line 185
    const-string v0, "XMPPTCPConnection"

    const-string v1, "PacketWriter begin shutdown()"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdown(Z)V

    .line 188
    :cond_0
    const-string v0, "XMPPTCPConnection"

    const-string v1, "PacketWriter has been shut down"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    if-eqz v0, :cond_1

    .line 191
    const-string v0, "XMPPTCPConnection"

    const-string v1, "PacketReader begin shutdown()"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->shutdown()V

    .line 194
    :cond_1
    const-string v0, "XMPPTCPConnection"

    const-string v1, "PacketReader has been shut down"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    if-eqz v0, :cond_2

    .line 198
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :cond_2
    goto :goto_0

    .line 200
    :catch_0
    move-exception v3

    .line 201
    const-string v0, "XMPPTCPConnection"

    const-string v1, "shutdownc socket.close meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->setWasAuthenticated()V

    .line 206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->authenticated:Z

    .line 207
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->connected:Z

    .line 208
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->secureSocket:Ljavax/net/ssl/SSLSocket;

    .line 209
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->reader:Ljava/io/Reader;

    .line 210
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    .line 212
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initalOpenStreamSend:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->init()V

    .line 213
    const-string v0, "XMPPTCPConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "shutdown finish: instant:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    return-void
.end method


# virtual methods
.method public afterFeaturesReceived()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 375
    const-string v0, "starttls"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-tls"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getFeature(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/StartTls;

    .line 376
    if-eqz v2, :cond_1

    .line 377
    invoke-virtual {v2}, Lorg/jivesoftware/smack/packet/StartTls;->required()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getSecurityMode()Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    if-ne v0, v1, :cond_0

    .line 378
    new-instance v3, Lorg/jivesoftware/smack/SmackException;

    const-string v0, ""

    invoke-direct {v3, v0}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    .line 379
    invoke-direct {p0, v3}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->notifyConnectionError(Ljava/lang/Exception;)V

    .line 380
    return-void

    .line 383
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getSecurityMode()Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    if-eq v0, v1, :cond_1

    .line 384
    new-instance v0, Lorg/jivesoftware/smack/packet/StartTls;

    invoke-direct {v0}, Lorg/jivesoftware/smack/packet/StartTls;-><init>()V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V

    .line 389
    :cond_1
    return-void
.end method

.method public afterSuccessfulLogin(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 156
    invoke-super {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->afterSuccessfulLogin(Z)V

    .line 157
    return-void
.end method

.method public connectInternal()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/XMPPException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 335
    :try_start_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->connectUsingSSLSocket()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    goto :goto_0

    .line 336
    :catch_0
    move-exception v2

    .line 337
    const-string v0, "XMPPTCPConnection"

    const-string v1, "connectUsingSSLSocket meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 341
    :goto_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->initConnection()V

    .line 342
    return-void
.end method

.method public declared-synchronized instantShutdown()V
    .locals 2

    monitor-enter p0

    .line 178
    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->shutdown(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public isSecureConnection()Z
    .locals 1

    .line 161
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->secureSocket:Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isUsingCompression()Z
    .locals 1

    .line 311
    const/4 v0, 0x0

    return v0
.end method

.method public login(Lorg/jivesoftware/smack/SASLConfiguration;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/XMPPException;,
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 806
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/SASLAuthentication;->authenticate(Lorg/jivesoftware/smack/SASLConfiguration;)V

    .line 808
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->afterSuccessfulLogin(Z)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 812
    goto :goto_0

    .line 809
    :catch_0
    move-exception v1

    .line 811
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 813
    :goto_0
    return-void
.end method

.method openStream()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 404
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v7

    .line 405
    const/4 v8, 0x0

    .line 406
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getUsername()Ljava/lang/CharSequence;

    move-result-object v9

    .line 407
    if-eqz v9, :cond_0

    .line 408
    invoke-static {v9, v7}, Lo/fua;->d(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    .line 410
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getStreamId()Ljava/lang/String;

    move-result-object v10

    .line 412
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamOpen;

    iget-wide v4, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->uid:J

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->config:Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getAppVersion()Ljava/lang/String;

    move-result-object v6

    move-object v1, v7

    move-object v2, v8

    move-object v3, v10

    invoke-direct/range {v0 .. v6}, Lorg/jivesoftware/smack/packet/StreamOpen;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V

    .line 414
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetReader:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->reader:Ljava/io/Reader;

    invoke-static {v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->newXmppParser(Ljava/io/Reader;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    iput-object v1, v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    goto :goto_0

    .line 416
    :catch_0
    move-exception v11

    .line 417
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    invoke-direct {v0, v11}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 419
    :goto_0
    return-void
.end method

.method public sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->sendStreamElement(Lorg/jivesoftware/smack/packet/Element;)V

    .line 219
    return-void
.end method

.method public sendStanzaInternal(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->sendStreamElement(Lorg/jivesoftware/smack/packet/Element;)V

    .line 224
    return-void
.end method

.method public setSelfFullJid(Ljava/lang/String;)V
    .locals 3

    .line 791
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 793
    :try_start_0
    invoke-static {p1}, Lo/ftj;->a(Ljava/lang/String;)Lo/fti;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->user:Lo/fti;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    .line 796
    goto :goto_0

    .line 794
    :catch_0
    move-exception v2

    .line 795
    const-string v0, "XMPPTCPConnection"

    const-string v1, "setSelfFullJid meet XmppStringprepException."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 798
    :cond_0
    :goto_0
    return-void
.end method

.method public setUID(J)V
    .locals 0

    .line 782
    iput-wide p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->uid:J

    .line 783
    return-void
.end method

.method protected setWriter(Ljava/io/Writer;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->writer:Ljava/io/Writer;

    .line 371
    return-void
.end method

.method public shutdown()V
    .locals 1

    .line 171
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->shutdown(Z)V

    .line 172
    return-void
.end method

.method public throwAlreadyConnectedExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;
        }
    .end annotation

    .line 141
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    new-instance v0, Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;-><init>()V

    throw v0

    .line 144
    :cond_0
    return-void
.end method

.method public throwAlreadyLoggedInExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;
        }
    .end annotation

    .line 148
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    new-instance v0, Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;-><init>()V

    throw v0

    .line 151
    :cond_0
    return-void
.end method

.method public throwNotConnectedExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    if-nez v0, :cond_0

    .line 134
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>()V

    throw v0

    .line 136
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->throwNotConnectedExceptionIfDoneAndResumptionNotPossible()V

    .line 137
    return-void
.end method
