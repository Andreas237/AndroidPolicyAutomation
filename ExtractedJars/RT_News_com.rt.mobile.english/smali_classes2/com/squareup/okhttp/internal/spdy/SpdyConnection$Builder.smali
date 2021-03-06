.class public Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
.super Ljava/lang/Object;
.source "SpdyConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private client:Z

.field private handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

.field private hostName:Ljava/lang/String;

.field private protocol:Lcom/squareup/okhttp/Protocol;

.field private pushObserver:Lcom/squareup/okhttp/internal/spdy/PushObserver;

.field private socket:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/net/Socket;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 529
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 516
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;->REFUSE_INCOMING_STREAMS:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    .line 517
    sget-object v0, Lcom/squareup/okhttp/Protocol;->SPDY_3:Lcom/squareup/okhttp/Protocol;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->protocol:Lcom/squareup/okhttp/Protocol;

    .line 518
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/PushObserver;->CANCEL:Lcom/squareup/okhttp/internal/spdy/PushObserver;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->pushObserver:Lcom/squareup/okhttp/internal/spdy/PushObserver;

    .line 530
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->hostName:Ljava/lang/String;

    .line 531
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->client:Z

    .line 532
    iput-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->socket:Ljava/net/Socket;

    return-void
.end method

.method public constructor <init>(ZLjava/net/Socket;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 522
    invoke-virtual {p2}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;-><init>(Ljava/lang/String;ZLjava/net/Socket;)V

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Lcom/squareup/okhttp/Protocol;
    .locals 0

    .line 513
    iget-object p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->protocol:Lcom/squareup/okhttp/Protocol;

    return-object p0
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Lcom/squareup/okhttp/internal/spdy/PushObserver;
    .locals 0

    .line 513
    iget-object p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->pushObserver:Lcom/squareup/okhttp/internal/spdy/PushObserver;

    return-object p0
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Z
    .locals 0

    .line 513
    iget-boolean p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->client:Z

    return p0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;
    .locals 0

    .line 513
    iget-object p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    return-object p0
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Ljava/lang/String;
    .locals 0

    .line 513
    iget-object p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->hostName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;)Ljava/net/Socket;
    .locals 0

    .line 513
    iget-object p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->socket:Ljava/net/Socket;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 551
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;Lcom/squareup/okhttp/internal/spdy/SpdyConnection$1;)V

    return-object v0
.end method

.method public handler(Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->handler:Lcom/squareup/okhttp/internal/spdy/IncomingStreamHandler;

    return-object p0
.end method

.method public protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 0

    .line 541
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->protocol:Lcom/squareup/okhttp/Protocol;

    return-object p0
.end method

.method public pushObserver(Lcom/squareup/okhttp/internal/spdy/PushObserver;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;
    .locals 0

    .line 546
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$Builder;->pushObserver:Lcom/squareup/okhttp/internal/spdy/PushObserver;

    return-object p0
.end method
