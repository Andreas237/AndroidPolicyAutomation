.class public final Lokhttp3/internal/framed/FramedConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/framed/FramedConnection$Listener;,
        Lokhttp3/internal/framed/FramedConnection$Reader;,
        Lokhttp3/internal/framed/FramedConnection$Builder;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final OKHTTP_CLIENT_WINDOW_SIZE:I = 0x1000000

.field private static final executor:Ljava/util/concurrent/ExecutorService;


# instance fields
.field bytesLeftInWriteWindow:J

.field final client:Z

.field private final currentPushRequests:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field final frameWriter:Lokhttp3/internal/framed/FrameWriter;

.field private final hostname:Ljava/lang/String;

.field private idleStartTimeNs:J

.field private lastGoodStreamId:I

.field private final listener:Lokhttp3/internal/framed/FramedConnection$Listener;

.field private nextPingId:I

.field private nextStreamId:I

.field okHttpSettings:Lokhttp3/internal/framed/Settings;

.field final peerSettings:Lokhttp3/internal/framed/Settings;

.field private pings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lokhttp3/internal/framed/Ping;>;"
        }
    .end annotation
.end field

.field final protocol:Lokhttp3/Protocol;

.field private final pushExecutor:Ljava/util/concurrent/ExecutorService;

.field private final pushObserver:Lokhttp3/internal/framed/PushObserver;

.field final readerRunnable:Lokhttp3/internal/framed/FramedConnection$Reader;

.field private receivedInitialPeerSettings:Z

.field private shutdown:Z

.field final socket:Ljava/net/Socket;

.field private final streams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lokhttp3/internal/framed/FramedStream;>;"
        }
    .end annotation
.end field

.field unacknowledgedBytesRead:J

.field final variant:Lokhttp3/internal/framed/Variant;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 55
    const-class v0, Lokhttp3/internal/framed/FramedConnection;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lokhttp3/internal/framed/FramedConnection;->$assertionsDisabled:Z

    .line 69
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v1, "OkHttp FramedConnection"

    .line 71
    const/4 v2, 0x1

    invoke-static {v1, v2}, Lokhttp3/internal/Util;->threadFactory(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lokhttp3/internal/framed/FramedConnection;->executor:Ljava/util/concurrent/ExecutorService;

    .line 69
    return-void
.end method

.method private constructor <init>(Lokhttp3/internal/framed/FramedConnection$Builder;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    .line 89
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->idleStartTimeNs:J

    .line 105
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J

    .line 114
    new-instance v0, Lokhttp3/internal/framed/Settings;

    invoke-direct {v0}, Lokhttp3/internal/framed/Settings;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    .line 120
    new-instance v0, Lokhttp3/internal/framed/Settings;

    invoke-direct {v0}, Lokhttp3/internal/framed/Settings;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->peerSettings:Lokhttp3/internal/framed/Settings;

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->receivedInitialPeerSettings:Z

    .line 827
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->currentPushRequests:Ljava/util/Set;

    .line 131
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$000(Lokhttp3/internal/framed/FramedConnection$Builder;)Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    .line 132
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$100(Lokhttp3/internal/framed/FramedConnection$Builder;)Lokhttp3/internal/framed/PushObserver;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushObserver:Lokhttp3/internal/framed/PushObserver;

    .line 133
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$200(Lokhttp3/internal/framed/FramedConnection$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->client:Z

    .line 134
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$300(Lokhttp3/internal/framed/FramedConnection$Builder;)Lokhttp3/internal/framed/FramedConnection$Listener;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->listener:Lokhttp3/internal/framed/FramedConnection$Listener;

    .line 136
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$200(Lokhttp3/internal/framed/FramedConnection$Builder;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iput v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    .line 137
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$200(Lokhttp3/internal/framed/FramedConnection$Builder;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_1

    .line 138
    iget v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    .line 141
    :cond_1
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$200(Lokhttp3/internal/framed/FramedConnection$Builder;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    :goto_1
    iput v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextPingId:I

    .line 147
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$200(Lokhttp3/internal/framed/FramedConnection$Builder;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 148
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    const/4 v1, 0x7

    const/4 v2, 0x0

    const/high16 v3, 0x1000000

    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/internal/framed/Settings;->set(III)Lokhttp3/internal/framed/Settings;

    .line 151
    :cond_3
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$400(Lokhttp3/internal/framed/FramedConnection$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_4

    .line 154
    new-instance v0, Lokhttp3/internal/framed/Http2;

    invoke-direct {v0}, Lokhttp3/internal/framed/Http2;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->variant:Lokhttp3/internal/framed/Variant;

    .line 156
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-string v1, "OkHttp %s Push Observer"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 158
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lokhttp3/internal/Util;->threadFactory(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    .line 160
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->peerSettings:Lokhttp3/internal/framed/Settings;

    const/4 v1, 0x7

    const/4 v2, 0x0

    const v3, 0xffff

    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/internal/framed/Settings;->set(III)Lokhttp3/internal/framed/Settings;

    .line 161
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->peerSettings:Lokhttp3/internal/framed/Settings;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/16 v3, 0x4000

    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/internal/framed/Settings;->set(III)Lokhttp3/internal/framed/Settings;

    goto :goto_2

    .line 162
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->SPDY_3:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_5

    .line 163
    new-instance v0, Lokhttp3/internal/framed/Spdy3;

    invoke-direct {v0}, Lokhttp3/internal/framed/Spdy3;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->variant:Lokhttp3/internal/framed/Variant;

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    goto :goto_2

    .line 166
    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 168
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->peerSettings:Lokhttp3/internal/framed/Settings;

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    .line 169
    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$500(Lokhttp3/internal/framed/FramedConnection$Builder;)Ljava/net/Socket;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->socket:Ljava/net/Socket;

    .line 170
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->variant:Lokhttp3/internal/framed/Variant;

    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$600(Lokhttp3/internal/framed/FramedConnection$Builder;)Lokio/BufferedSink;

    move-result-object v1

    iget-boolean v2, p0, Lokhttp3/internal/framed/FramedConnection;->client:Z

    invoke-interface {v0, v1, v2}, Lokhttp3/internal/framed/Variant;->newWriter(Lokio/BufferedSink;Z)Lokhttp3/internal/framed/FrameWriter;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    .line 172
    new-instance v0, Lokhttp3/internal/framed/FramedConnection$Reader;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->variant:Lokhttp3/internal/framed/Variant;

    invoke-static {p1}, Lokhttp3/internal/framed/FramedConnection$Builder;->access$700(Lokhttp3/internal/framed/FramedConnection$Builder;)Lokio/BufferedSource;

    move-result-object v2

    iget-boolean v3, p0, Lokhttp3/internal/framed/FramedConnection;->client:Z

    invoke-interface {v1, v2, v3}, Lokhttp3/internal/framed/Variant;->newReader(Lokio/BufferedSource;Z)Lokhttp3/internal/framed/FrameReader;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lokhttp3/internal/framed/FramedConnection$Reader;-><init>(Lokhttp3/internal/framed/FramedConnection;Lokhttp3/internal/framed/FrameReader;Lokhttp3/internal/framed/FramedConnection$1;)V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->readerRunnable:Lokhttp3/internal/framed/FramedConnection$Reader;

    .line 173
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->readerRunnable:Lokhttp3/internal/framed/FramedConnection$Reader;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 174
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/framed/FramedConnection$Builder;Lokhttp3/internal/framed/FramedConnection$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/FramedConnection;-><init>(Lokhttp3/internal/framed/FramedConnection$Builder;)V

    return-void
.end method

.method static synthetic access$1100(Lokhttp3/internal/framed/FramedConnection;)Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1200(Lokhttp3/internal/framed/FramedConnection;Lokhttp3/internal/framed/ErrorCode;Lokhttp3/internal/framed/ErrorCode;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/framed/FramedConnection;->close(Lokhttp3/internal/framed/ErrorCode;Lokhttp3/internal/framed/ErrorCode;)V

    return-void
.end method

.method static synthetic access$1300(Lokhttp3/internal/framed/FramedConnection;I)Z
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/FramedConnection;->pushedStream(I)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1400(Lokhttp3/internal/framed/FramedConnection;ILokio/BufferedSource;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/framed/FramedConnection;->pushDataLater(ILokio/BufferedSource;IZ)V

    return-void
.end method

.method static synthetic access$1500(Lokhttp3/internal/framed/FramedConnection;ILjava/util/List;Z)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/framed/FramedConnection;->pushHeadersLater(ILjava/util/List;Z)V

    return-void
.end method

.method static synthetic access$1600(Lokhttp3/internal/framed/FramedConnection;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    return v0
.end method

.method static synthetic access$1602(Lokhttp3/internal/framed/FramedConnection;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    return p1
.end method

.method static synthetic access$1700(Lokhttp3/internal/framed/FramedConnection;)I
    .locals 1

    .line 55
    iget v0, p0, Lokhttp3/internal/framed/FramedConnection;->lastGoodStreamId:I

    return v0
.end method

.method static synthetic access$1702(Lokhttp3/internal/framed/FramedConnection;I)I
    .locals 0

    .line 55
    iput p1, p0, Lokhttp3/internal/framed/FramedConnection;->lastGoodStreamId:I

    return p1
.end method

.method static synthetic access$1800(Lokhttp3/internal/framed/FramedConnection;)I
    .locals 1

    .line 55
    iget v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    return v0
.end method

.method static synthetic access$1900(Lokhttp3/internal/framed/FramedConnection;)Ljava/util/Map;
    .locals 1

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$2000(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/FramedConnection$Listener;
    .locals 1

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->listener:Lokhttp3/internal/framed/FramedConnection$Listener;

    return-object v0
.end method

.method static synthetic access$2100()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 55
    sget-object v0, Lokhttp3/internal/framed/FramedConnection;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic access$2200(Lokhttp3/internal/framed/FramedConnection;ILokhttp3/internal/framed/ErrorCode;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/framed/FramedConnection;->pushResetLater(ILokhttp3/internal/framed/ErrorCode;)V

    return-void
.end method

.method static synthetic access$2300(Lokhttp3/internal/framed/FramedConnection;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->receivedInitialPeerSettings:Z

    return v0
.end method

.method static synthetic access$2302(Lokhttp3/internal/framed/FramedConnection;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lokhttp3/internal/framed/FramedConnection;->receivedInitialPeerSettings:Z

    return p1
.end method

.method static synthetic access$2400(Lokhttp3/internal/framed/FramedConnection;I)Lokhttp3/internal/framed/Ping;
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Lokhttp3/internal/framed/FramedConnection;->removePing(I)Lokhttp3/internal/framed/Ping;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2500(Lokhttp3/internal/framed/FramedConnection;ZIILokhttp3/internal/framed/Ping;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/framed/FramedConnection;->writePingLater(ZIILokhttp3/internal/framed/Ping;)V

    return-void
.end method

.method static synthetic access$2600(Lokhttp3/internal/framed/FramedConnection;ILjava/util/List;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/framed/FramedConnection;->pushRequestLater(ILjava/util/List;)V

    return-void
.end method

.method static synthetic access$2700(Lokhttp3/internal/framed/FramedConnection;)Lokhttp3/internal/framed/PushObserver;
    .locals 1

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushObserver:Lokhttp3/internal/framed/PushObserver;

    return-object v0
.end method

.method static synthetic access$2800(Lokhttp3/internal/framed/FramedConnection;)Ljava/util/Set;
    .locals 1

    .line 55
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->currentPushRequests:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$900(Lokhttp3/internal/framed/FramedConnection;ZIILokhttp3/internal/framed/Ping;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/framed/FramedConnection;->writePing(ZIILokhttp3/internal/framed/Ping;)V

    return-void
.end method

.method private close(Lokhttp3/internal/framed/ErrorCode;Lokhttp3/internal/framed/ErrorCode;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 448
    sget-boolean v0, Lokhttp3/internal/framed/FramedConnection;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 449
    :cond_0
    const/4 v2, 0x0

    .line 451
    :try_start_0
    invoke-virtual {p0, p1}, Lokhttp3/internal/framed/FramedConnection;->shutdown(Lokhttp3/internal/framed/ErrorCode;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    goto :goto_0

    .line 452
    :catch_0
    move-exception v3

    .line 453
    move-object v2, v3

    .line 456
    :goto_0
    const/4 v3, 0x0

    .line 457
    const/4 v4, 0x0

    .line 458
    move-object v5, p0

    monitor-enter v5

    .line 459
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 460
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lokhttp3/internal/framed/FramedStream;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Lokhttp3/internal/framed/FramedStream;

    .line 461
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 462
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedConnection;->setIdle(Z)V

    .line 464
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 465
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lokhttp3/internal/framed/Ping;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Lokhttp3/internal/framed/Ping;

    .line 466
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 468
    :cond_2
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 470
    :goto_1
    if-eqz v3, :cond_4

    .line 471
    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_4

    aget-object v8, v5, v7

    .line 473
    :try_start_2
    invoke-virtual {v8, p2}, Lokhttp3/internal/framed/FramedStream;->close(Lokhttp3/internal/framed/ErrorCode;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 476
    goto :goto_3

    .line 474
    :catch_1
    move-exception v9

    .line 475
    if-eqz v2, :cond_3

    move-object v2, v9

    .line 471
    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 480
    :cond_4
    if-eqz v4, :cond_5

    .line 481
    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v6, :cond_5

    aget-object v8, v5, v7

    .line 482
    invoke-virtual {v8}, Lokhttp3/internal/framed/Ping;->cancel()V

    .line 481
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 488
    :cond_5
    :try_start_3
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0}, Lokhttp3/internal/framed/FrameWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 491
    goto :goto_5

    .line 489
    :catch_2
    move-exception v5

    .line 490
    if-nez v2, :cond_6

    move-object v2, v5

    .line 495
    :cond_6
    :goto_5
    :try_start_4
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 498
    goto :goto_6

    .line 496
    :catch_3
    move-exception v5

    .line 497
    move-object v2, v5

    .line 500
    :goto_6
    if-eqz v2, :cond_7

    throw v2

    .line 501
    :cond_7
    return-void
.end method

.method private newStream(ILjava/util/List;ZZ)Lokhttp3/internal/framed/FramedStream;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lokhttp3/internal/framed/Header;>;ZZ)Lokhttp3/internal/framed/FramedStream;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 251
    if-nez p3, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 252
    :goto_0
    if-nez p4, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 256
    :goto_1
    iget-object v10, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    monitor-enter v10

    .line 257
    move-object v11, p0

    :try_start_0
    monitor-enter v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 258
    :try_start_1
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    if-eqz v0, :cond_2

    .line 259
    new-instance v0, Ljava/io/IOException;

    const-string v1, "shutdown"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 261
    :cond_2
    iget v9, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    .line 262
    iget v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextStreamId:I

    .line 263
    new-instance v0, Lokhttp3/internal/framed/FramedStream;

    move v1, v9

    move-object v2, p0

    move v3, v6

    move v4, v7

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/framed/FramedStream;-><init>(ILokhttp3/internal/framed/FramedConnection;ZZLjava/util/List;)V

    move-object v8, v0

    .line 264
    invoke-virtual {v8}, Lokhttp3/internal/framed/FramedStream;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 265
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedConnection;->setIdle(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 268
    :cond_3
    monitor-exit v11

    goto :goto_2

    :catchall_0
    move-exception v12

    monitor-exit v11

    :try_start_2
    throw v12

    .line 269
    :goto_2
    if-nez p1, :cond_4

    .line 270
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    move v1, v6

    move v2, v7

    move v3, v9

    move v4, p1

    move-object/from16 v5, p2

    invoke-interface/range {v0 .. v5}, Lokhttp3/internal/framed/FrameWriter;->synStream(ZZIILjava/util/List;)V

    goto :goto_3

    .line 272
    :cond_4
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->client:Z

    if-eqz v0, :cond_5

    .line 273
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "client streams shouldn\'t have associated stream IDs"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 275
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    move-object/from16 v1, p2

    invoke-interface {v0, p1, v9, v1}, Lokhttp3/internal/framed/FrameWriter;->pushPromise(IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 277
    :goto_3
    monitor-exit v10

    goto :goto_4

    :catchall_1
    move-exception v13

    monitor-exit v10

    throw v13

    .line 279
    :goto_4
    if-nez p3, :cond_6

    .line 280
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0}, Lokhttp3/internal/framed/FrameWriter;->flush()V

    .line 283
    :cond_6
    return-object v8
.end method

.method private pushDataLater(ILokio/BufferedSource;IZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 877
    new-instance v9, Lokio/Buffer;

    invoke-direct {v9}, Lokio/Buffer;-><init>()V

    .line 878
    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Lokio/BufferedSource;->require(J)V

    .line 879
    int-to-long v0, p3

    invoke-interface {p2, v9, v0, v1}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    .line 880
    invoke-virtual {v9}, Lokio/Buffer;->size()J

    move-result-wide v0

    int-to-long v2, p3

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lokio/Buffer;->size()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " != "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 881
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$6;

    const-string v3, "OkHttp %s Push Data[%s]"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-object v6, v9

    move v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, Lokhttp3/internal/framed/FramedConnection$6;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILokio/Buffer;IZ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 895
    return-void
.end method

.method private pushHeadersLater(ILjava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lokhttp3/internal/framed/Header;>;Z)V"
        }
    .end annotation

    .line 855
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$5;

    const-string v3, "OkHttp %s Push Headers[%s]"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move v7, p3

    invoke-direct/range {v1 .. v7}, Lokhttp3/internal/framed/FramedConnection$5;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 869
    return-void
.end method

.method private pushRequestLater(ILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lokhttp3/internal/framed/Header;>;)V"
        }
    .end annotation

    .line 830
    move-object v7, p0

    monitor-enter v7

    .line 831
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->currentPushRequests:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 832
    sget-object v0, Lokhttp3/internal/framed/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/framed/ErrorCode;

    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/framed/FramedConnection;->writeSynResetLater(ILokhttp3/internal/framed/ErrorCode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 833
    monitor-exit v7

    return-void

    .line 835
    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->currentPushRequests:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 836
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 837
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$4;

    const-string v3, "OkHttp %s Push Request[%s]"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/framed/FramedConnection$4;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 851
    return-void
.end method

.method private pushResetLater(ILokhttp3/internal/framed/ErrorCode;)V
    .locals 7

    .line 898
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pushExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$7;

    const-string v3, "OkHttp %s Push Reset[%s]"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/framed/FramedConnection$7;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILokhttp3/internal/framed/ErrorCode;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 906
    return-void
.end method

.method private pushedStream(I)Z
    .locals 2

    .line 823
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private declared-synchronized removePing(I)Lokhttp3/internal/framed/Ping;
    .locals 2

    monitor-enter p0

    .line 412
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Ping;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setIdle(Z)V
    .locals 2

    monitor-enter p0

    .line 202
    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->idleStartTimeNs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private writePing(ZIILokhttp3/internal/framed/Ping;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 404
    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    monitor-enter v1

    .line 406
    if-eqz p4, :cond_0

    :try_start_0
    invoke-virtual {p4}, Lokhttp3/internal/framed/Ping;->send()V

    .line 407
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0, p1, p2, p3}, Lokhttp3/internal/framed/FrameWriter;->ping(ZII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 409
    :goto_0
    return-void
.end method

.method private writePingLater(ZIILokhttp3/internal/framed/Ping;)V
    .locals 9

    .line 392
    sget-object v0, Lokhttp3/internal/framed/FramedConnection;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$3;

    const-string v3, "OkHttp %s ping %08x%08x"

    const/4 v2, 0x3

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    .line 393
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move v6, p2

    move v7, p3

    move-object v8, p4

    invoke-direct/range {v1 .. v8}, Lokhttp3/internal/framed/FramedConnection$3;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ZIILokhttp3/internal/framed/Ping;)V

    .line 392
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 401
    return-void
.end method


# virtual methods
.method addBytesToWriteWindow(J)V
    .locals 2

    .line 340
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    .line 341
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 342
    :cond_0
    return-void
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 444
    sget-object v0, Lokhttp3/internal/framed/ErrorCode;->NO_ERROR:Lokhttp3/internal/framed/ErrorCode;

    sget-object v1, Lokhttp3/internal/framed/ErrorCode;->CANCEL:Lokhttp3/internal/framed/ErrorCode;

    invoke-direct {p0, v0, v1}, Lokhttp3/internal/framed/FramedConnection;->close(Lokhttp3/internal/framed/ErrorCode;Lokhttp3/internal/framed/ErrorCode;)V

    .line 445
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 416
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0}, Lokhttp3/internal/framed/FrameWriter;->flush()V

    .line 417
    return-void
.end method

.method public declared-synchronized getIdleStartTimeNs()J
    .locals 3

    monitor-enter p0

    .line 219
    :try_start_0
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->idleStartTimeNs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public getProtocol()Lokhttp3/Protocol;
    .locals 1

    .line 178
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    return-object v0
.end method

.method declared-synchronized getStream(I)Lokhttp3/internal/framed/FramedStream;
    .locals 2

    monitor-enter p0

    .line 189
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/FramedStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized isIdle()Z
    .locals 5

    monitor-enter p0

    .line 207
    :try_start_0
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->idleStartTimeNs:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public declared-synchronized maxConcurrentStreams()I
    .locals 3

    monitor-enter p0

    .line 211
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->peerSettings:Lokhttp3/internal/framed/Settings;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/Settings;->getMaxConcurrentStreams(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public newStream(Ljava/util/List;ZZ)Lokhttp3/internal/framed/FramedStream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/internal/framed/Header;>;ZZ)Lokhttp3/internal/framed/FramedStream;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 246
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2, p3}, Lokhttp3/internal/framed/FramedConnection;->newStream(ILjava/util/List;ZZ)Lokhttp3/internal/framed/FramedStream;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized openStreamCount()I
    .locals 2

    monitor-enter p0

    .line 185
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public ping()Lokhttp3/internal/framed/Ping;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 375
    new-instance v2, Lokhttp3/internal/framed/Ping;

    invoke-direct {v2}, Lokhttp3/internal/framed/Ping;-><init>()V

    .line 377
    move-object v4, p0

    monitor-enter v4

    .line 378
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    if-eqz v0, :cond_0

    .line 379
    new-instance v0, Ljava/io/IOException;

    const-string v1, "shutdown"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_0
    iget v3, p0, Lokhttp3/internal/framed/FramedConnection;->nextPingId:I

    .line 382
    iget v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextPingId:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lokhttp3/internal/framed/FramedConnection;->nextPingId:I

    .line 383
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    .line 384
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->pings:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 386
    :goto_0
    const/4 v0, 0x0

    const v1, 0x4f4b6f6b

    invoke-direct {p0, v0, v3, v1, v2}, Lokhttp3/internal/framed/FramedConnection;->writePing(ZIILokhttp3/internal/framed/Ping;)V

    .line 387
    return-object v2
.end method

.method public pushStream(ILjava/util/List;Z)Lokhttp3/internal/framed/FramedStream;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lokhttp3/internal/framed/Header;>;Z)Lokhttp3/internal/framed/FramedStream;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 231
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->client:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Client cannot push requests."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 232
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->protocol:Lokhttp3/Protocol;

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol != HTTP_2"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lokhttp3/internal/framed/FramedConnection;->newStream(ILjava/util/List;ZZ)Lokhttp3/internal/framed/FramedStream;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized removeStream(I)Lokhttp3/internal/framed/FramedStream;
    .locals 3

    monitor-enter p0

    .line 193
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lokhttp3/internal/framed/FramedStream;

    .line 194
    if-eqz v2, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedConnection;->setIdle(Z)V

    .line 197
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public sendConnectionPreface()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 508
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0}, Lokhttp3/internal/framed/FrameWriter;->connectionPreface()V

    .line 509
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    invoke-interface {v0, v1}, Lokhttp3/internal/framed/FrameWriter;->settings(Lokhttp3/internal/framed/Settings;)V

    .line 510
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result v4

    .line 511
    const/high16 v0, 0x10000

    if-eq v4, v0, :cond_0

    .line 512
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    const/high16 v1, 0x10000

    sub-int v1, v4, v1

    int-to-long v1, v1

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lokhttp3/internal/framed/FrameWriter;->windowUpdate(IJ)V

    .line 514
    :cond_0
    return-void
.end method

.method public setSettings(Lokhttp3/internal/framed/Settings;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 518
    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    monitor-enter v2

    .line 519
    move-object v3, p0

    :try_start_0
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 520
    :try_start_1
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    if-eqz v0, :cond_0

    .line 521
    new-instance v0, Ljava/io/IOException;

    const-string v1, "shutdown"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 523
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    invoke-virtual {v0, p1}, Lokhttp3/internal/framed/Settings;->merge(Lokhttp3/internal/framed/Settings;)V

    .line 524
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0, p1}, Lokhttp3/internal/framed/FrameWriter;->settings(Lokhttp3/internal/framed/Settings;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 525
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 526
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v5

    monitor-exit v2

    throw v5

    .line 527
    :goto_1
    return-void
.end method

.method public shutdown(Lokhttp3/internal/framed/ErrorCode;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 425
    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    monitor-enter v2

    .line 427
    move-object v4, p0

    :try_start_0
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 428
    :try_start_1
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 429
    monitor-exit v4

    monitor-exit v2

    return-void

    .line 431
    :cond_0
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lokhttp3/internal/framed/FramedConnection;->shutdown:Z

    .line 432
    iget v3, p0, Lokhttp3/internal/framed/FramedConnection;->lastGoodStreamId:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 433
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    :try_start_3
    throw v5

    .line 435
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    sget-object v1, Lokhttp3/internal/Util;->EMPTY_BYTE_ARRAY:[B

    invoke-interface {v0, v3, p1, v1}, Lokhttp3/internal/framed/FrameWriter;->goAway(ILokhttp3/internal/framed/ErrorCode;[B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 436
    monitor-exit v2

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v2

    throw v6

    .line 437
    :goto_1
    return-void
.end method

.method public writeData(IZLokio/Buffer;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 305
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    .line 306
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    const/4 v1, 0x0

    invoke-interface {v0, p2, p1, p3, v1}, Lokhttp3/internal/framed/FrameWriter;->data(ZILokio/Buffer;I)V

    .line 307
    return-void

    .line 310
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_4

    .line 312
    move-object v5, p0

    monitor-enter v5

    .line 314
    :goto_1
    :try_start_0
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 317
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->streams:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 318
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 320
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 324
    :cond_2
    goto :goto_2

    .line 322
    :catch_0
    move-exception v6

    .line 323
    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    .line 326
    :goto_2
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v4, v0

    .line 327
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0}, Lokhttp3/internal/framed/FrameWriter;->maxDataLength()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 328
    iget-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J

    int-to-long v2, v4

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lokhttp3/internal/framed/FramedConnection;->bytesLeftInWriteWindow:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 329
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 331
    :goto_3
    int-to-long v0, v4

    sub-long/2addr p4, v0

    .line 332
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    if-eqz p2, :cond_3

    const-wide/16 v1, 0x0

    cmp-long v1, p4, v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    :goto_4
    invoke-interface {v0, v1, p1, p3, v4}, Lokhttp3/internal/framed/FrameWriter;->data(ZILokio/Buffer;I)V

    .line 333
    goto/16 :goto_0

    .line 334
    :cond_4
    return-void
.end method

.method writeSynReply(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZLjava/util/List<Lokhttp3/internal/framed/Header;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0, p2, p1, p3}, Lokhttp3/internal/framed/FrameWriter;->synReply(ZILjava/util/List;)V

    .line 289
    return-void
.end method

.method writeSynReset(ILokhttp3/internal/framed/ErrorCode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 356
    iget-object v0, p0, Lokhttp3/internal/framed/FramedConnection;->frameWriter:Lokhttp3/internal/framed/FrameWriter;

    invoke-interface {v0, p1, p2}, Lokhttp3/internal/framed/FrameWriter;->rstStream(ILokhttp3/internal/framed/ErrorCode;)V

    .line 357
    return-void
.end method

.method writeSynResetLater(ILokhttp3/internal/framed/ErrorCode;)V
    .locals 7

    .line 345
    sget-object v0, Lokhttp3/internal/framed/FramedConnection;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$1;

    const-string v3, "OkHttp %s stream %d"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/framed/FramedConnection$1;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;ILokhttp3/internal/framed/ErrorCode;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 353
    return-void
.end method

.method writeWindowUpdateLater(IJ)V
    .locals 8

    .line 360
    sget-object v0, Lokhttp3/internal/framed/FramedConnection;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lokhttp3/internal/framed/FramedConnection$2;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lokhttp3/internal/framed/FramedConnection;->hostname:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lokhttp3/internal/framed/FramedConnection$2;-><init>(Lokhttp3/internal/framed/FramedConnection;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 368
    return-void
.end method
