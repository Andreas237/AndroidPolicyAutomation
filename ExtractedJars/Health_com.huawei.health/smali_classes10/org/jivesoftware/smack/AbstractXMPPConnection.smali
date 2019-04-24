.class public abstract Lorg/jivesoftware/smack/AbstractXMPPConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/XMPPConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;,
        Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "sns"

.field private static final connectionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static replyToUnknownIqDefault:Z = false


# instance fields
.field private final asyncRecvListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;>;"
        }
    .end annotation
.end field

.field protected authenticated:Z

.field private final cachedExecutorService:Ljava/util/concurrent/ExecutorService;

.field private final collectors:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lorg/jivesoftware/smack/StanzaCollector;>;"
        }
    .end annotation
.end field

.field protected final config:Lorg/jivesoftware/smack/ConnectionConfiguration;

.field protected connected:Z

.field protected final connectionCounterValue:I

.field protected final connectionListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lorg/jivesoftware/smack/ConnectionListener;>;"
        }
    .end annotation
.end field

.field protected final connectionLock:Ljava/util/concurrent/locks/Lock;

.field protected debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

.field private final executorService:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

.field private fromMode:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

.field private final getIqRequestHandler:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;>;"
        }
    .end annotation
.end field

.field protected host:Ljava/lang/String;

.field private final interceptors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;>;"
        }
    .end annotation
.end field

.field public volatile isQuitConnection:Z

.field protected final lastFeaturesReceived:Lorg/jivesoftware/smack/SynchronizationPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/SynchronizationPoint<Ljava/lang/Exception;>;"
        }
    .end annotation
.end field

.field private lastStanzaReceived:J

.field private parsingExceptionCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

.field protected port:I

.field protected reader:Ljava/io/Reader;

.field private final removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

.field private replyTimeout:J

.field private replyToUnkownIq:Z

.field protected final saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

.field public final saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/SynchronizationPoint<Lorg/jivesoftware/smack/SmackException;>;"
        }
    .end annotation
.end field

.field private final sendListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;>;"
        }
    .end annotation
.end field

.field private final setIqRequestHandler:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;>;"
        }
    .end annotation
.end field

.field private final singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

.field protected final streamFeatures:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation
.end field

.field public streamId:Ljava/lang/String;

.field private final syncRecvListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;>;"
        }
    .end annotation
.end field

.field protected user:Lo/fti;

.field protected wasAuthenticated:Z

.field public writer:Ljava/io/Writer;

.field private xmppServiceDomain:Lo/fsz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 83
    const-class v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->$assertionsDisabled:Z

    .line 91
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getVersion()Ljava/lang/String;

    .line 801
    const/4 v0, 0x1

    sput-boolean v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnknownIqDefault:Z

    return-void
.end method

.method protected constructor <init>(Lorg/jivesoftware/smack/ConnectionConfiguration;)V
    .locals 10

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    .line 116
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->collectors:Ljava/util/Collection;

    .line 121
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    .line 126
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    .line 131
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->interceptors:Ljava/util/Map;

    .line 142
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionLock:Ljava/util/concurrent/locks/Lock;

    .line 144
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamFeatures:Ljava/util/Map;

    .line 156
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connected:Z

    .line 166
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getDefaultReplyTimeout()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyTimeout:J

    .line 171
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    .line 189
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint;

    const-string v1, "last stream features received from server"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/SynchronizationPoint;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->lastFeaturesReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    .line 195
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint;

    const-string v1, "SASL mechanisms stream feature from server"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/SynchronizationPoint;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    .line 207
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionCounterValue:I

    .line 217
    sget-object v0, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->UNCHANGED:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->fromMode:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    .line 220
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getDefaultParsingExceptionCallback()Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->parsingExceptionCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    .line 227
    new-instance v0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;

    const-string v1, "Incoming Processor"

    invoke-direct {v7, p0, v1}, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    const/16 v6, 0x64

    invoke-direct/range {v0 .. v7}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;ILjava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->executorService:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    .line 233
    new-instance v0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;

    const-string v1, "Remove Callbacks"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 240
    new-instance v0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;

    const-string v1, "Cached Executor"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->cachedExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 256
    new-instance v0, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;

    const-string v1, "Single Threaded Executor"

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/util/SmackExecutorThreadFactory;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 272
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->authenticated:Z

    .line 278
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->wasAuthenticated:Z

    .line 280
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    .line 281
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    .line 286
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isQuitConnection:Z

    .line 814
    sget-boolean v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnknownIqDefault:Z

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnkownIq:Z

    .line 294
    new-instance v0, Lorg/jivesoftware/smack/SASLAuthentication;

    invoke-direct {v0, p0, p1}, Lorg/jivesoftware/smack/SASLAuthentication;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/ConnectionConfiguration;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

    .line 295
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 297
    invoke-static {}, Lorg/jivesoftware/smack/XMPPConnectionRegistry;->getConnectionCreationListeners()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lorg/jivesoftware/smack/ConnectionCreationListener;

    .line 298
    invoke-interface {v9, p0}, Lorg/jivesoftware/smack/ConnectionCreationListener;->connectionCreated(Lorg/jivesoftware/smack/XMPPConnection;)V

    .line 299
    goto :goto_0

    .line 300
    :cond_0
    return-void
.end method

.method public static setReplyToUnknownIqDefault(Z)V
    .locals 0

    .line 811
    sput-boolean p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnknownIqDefault:Z

    .line 812
    return-void
.end method


# virtual methods
.method public addAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 5

    .line 663
    if-nez p1, :cond_0

    .line 664
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Packet listener is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 666
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    invoke-direct {v2, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;-><init>(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 667
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    monitor-enter v3

    .line 668
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 669
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 670
    :goto_0
    return-void
.end method

.method public addConnectionListener(Lorg/jivesoftware/smack/ConnectionListener;)V
    .locals 1

    .line 577
    if-nez p1, :cond_0

    .line 578
    return-void

    .line 580
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 581
    return-void
.end method

.method public addOneTimeSyncCallback(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 6

    .line 1357
    new-instance v5, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;

    invoke-direct {v5, p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;)V

    .line 1367
    invoke-virtual {p0, v5, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->addSyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 1368
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lorg/jivesoftware/smack/AbstractXMPPConnection$8;

    invoke-direct {v1, p0, v5}, Lorg/jivesoftware/smack/AbstractXMPPConnection$8;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;)V

    .line 1373
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getReplyTimeout()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1368
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1374
    return-void
.end method

.method public addPacketInterceptor(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 5

    .line 737
    if-nez p1, :cond_0

    .line 738
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Packet interceptor is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 740
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;

    invoke-direct {v2, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;-><init>(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 741
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->interceptors:Ljava/util/Map;

    monitor-enter v3

    .line 742
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->interceptors:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 743
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 744
    :goto_0
    return-void
.end method

.method public addPacketListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 634
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->addAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 635
    return-void
.end method

.method public addPacketSendingListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 5

    .line 681
    if-nez p1, :cond_0

    .line 682
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Packet listener is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 684
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    invoke-direct {v2, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;-><init>(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 685
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    monitor-enter v3

    .line 686
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 687
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 688
    :goto_0
    return-void
.end method

.method protected addStreamFeature(Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    .locals 3

    .line 1265
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1266
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamFeatures:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1267
    return-void
.end method

.method public addSyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 5

    .line 645
    if-nez p1, :cond_0

    .line 646
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Packet listener is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 648
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    invoke-direct {v2, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;-><init>(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 649
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    monitor-enter v3

    .line 650
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 651
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 652
    :goto_0
    return-void
.end method

.method protected afterFeaturesReceived()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$SecurityRequiredException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1251
    return-void
.end method

.method protected afterSuccessfulLogin(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 429
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->authenticated:Z

    .line 435
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->isDebuggerEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->user:Lo/fti;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->userHasLogged(Lo/fti;)V

    .line 438
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->callConnectionAuthenticatedListener(Z)V

    .line 440
    return-void
.end method

.method protected final asyncGo(Ljava/lang/Runnable;)V
    .locals 1

    .line 1448
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->cachedExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1449
    return-void
.end method

.method protected callConnectionAuthenticatedListener(Z)V
    .locals 5

    .line 1036
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/ConnectionListener;

    .line 1038
    :try_start_0
    invoke-interface {v3, p0, p1}, Lorg/jivesoftware/smack/ConnectionListener;->authenticated(Lorg/jivesoftware/smack/XMPPConnection;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1043
    goto :goto_1

    .line 1039
    :catch_0
    move-exception v4

    .line 1042
    const-string v0, "sns"

    const-string v1, "Exception in authenticated listener"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1044
    :goto_1
    goto :goto_0

    .line 1045
    :cond_0
    return-void
.end method

.method callConnectionClosedListener()V
    .locals 5

    .line 1048
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/ConnectionListener;

    .line 1050
    :try_start_0
    invoke-interface {v3}, Lorg/jivesoftware/smack/ConnectionListener;->connectionClosed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1056
    goto :goto_1

    .line 1052
    :catch_0
    move-exception v4

    .line 1055
    const-string v0, "sns"

    const-string v1, "Error in listener while closing connection"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1057
    :goto_1
    goto :goto_0

    .line 1058
    :cond_0
    return-void
.end method

.method protected callConnectionClosedOnErrorListener(Ljava/lang/Exception;)V
    .locals 7

    .line 1061
    const/4 v3, 0x1

    .line 1062
    instance-of v0, p1, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    if-eqz v0, :cond_0

    .line 1063
    move-object v4, p1

    check-cast v4, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    .line 1064
    invoke-virtual {v4}, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;->getStreamError()Lorg/jivesoftware/smack/packet/StreamError;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/StreamError;->getCondition()Lorg/jivesoftware/smack/packet/StreamError$Condition;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/StreamError$Condition;->not_authorized:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->wasAuthenticated:Z

    if-eqz v0, :cond_0

    .line 1066
    const/4 v3, 0x0

    .line 1067
    const-string v0, "sns"

    const-string v1, "Connection closed with not-authorized stream error after it was already authenticated. The account was likely deleted/unregistered on the server"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1071
    :cond_0
    if-eqz v3, :cond_1

    .line 1072
    const-string v0, "sns"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Connection "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " closed with error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1074
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/ConnectionListener;

    .line 1076
    :try_start_0
    invoke-interface {v5, p1}, Lorg/jivesoftware/smack/ConnectionListener;->connectionClosedOnError(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1082
    goto :goto_1

    .line 1078
    :catch_0
    move-exception v6

    .line 1081
    const-string v0, "sns"

    const-string v1, "Error in listener while closing connection"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1083
    :goto_1
    goto :goto_0

    .line 1084
    :cond_2
    return-void
.end method

.method protected callConnectionConnectedListener()V
    .locals 3

    .line 1030
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/ConnectionListener;

    .line 1031
    invoke-interface {v2, p0}, Lorg/jivesoftware/smack/ConnectionListener;->connected(Lorg/jivesoftware/smack/XMPPConnection;)V

    .line 1032
    goto :goto_0

    .line 1033
    :cond_0
    return-void
.end method

.method public declared-synchronized connect()Lorg/jivesoftware/smack/AbstractXMPPConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/XMPPException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    monitor-enter p0

    .line 360
    :try_start_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->throwAlreadyConnectedExceptionIfAppropriate()V

    .line 363
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SASLAuthentication;->init()V

    .line 364
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->init()V

    .line 366
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->lastFeaturesReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->init()V

    .line 368
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamId:Ljava/lang/String;

    .line 370
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectInternal()V

    .line 373
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkIfSuccessOrWaitOrThrow()V

    .line 376
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connected:Z

    .line 377
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->callConnectionConnectedListener()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method protected abstract connectInternal()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/XMPPException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public createStanzaCollector(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/StanzaCollector;
    .locals 2

    .line 620
    new-instance v1, Lorg/jivesoftware/smack/StanzaCollector;

    invoke-direct {v1, p0, p1}, Lorg/jivesoftware/smack/StanzaCollector;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/StanzaCollector$Configuration;)V

    .line 622
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->collectors:Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 623
    return-object v1
.end method

.method public createStanzaCollector(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector;
    .locals 2

    .line 614
    invoke-static {}, Lorg/jivesoftware/smack/StanzaCollector;->newConfiguration()Lorg/jivesoftware/smack/StanzaCollector$Configuration;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->setStanzaFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector$Configuration;

    move-result-object v1

    .line 615
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->createStanzaCollector(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/StanzaCollector;

    move-result-object v0

    return-object v0
.end method

.method public createStanzaCollectorAndSend(Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/StanzaCollector;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 600
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->createStanzaCollector(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector;

    move-result-object v0

    .line 603
    :try_start_0
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 608
    goto :goto_0

    .line 605
    :catch_0
    move-exception v1

    .line 606
    invoke-virtual {v0}, Lorg/jivesoftware/smack/StanzaCollector;->cancel()V

    .line 607
    throw v1

    .line 609
    :goto_0
    return-object v0
.end method

.method public createStanzaCollectorAndSend(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/StanzaCollector;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 590
    new-instance v0, Lorg/jivesoftware/smack/filter/IQReplyFilter;

    invoke-direct {v0, p1, p0}, Lorg/jivesoftware/smack/filter/IQReplyFilter;-><init>(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/XMPPConnection;)V

    .line 592
    invoke-virtual {p0, v0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->createStanzaCollectorAndSend(Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/StanzaCollector;

    move-result-object v1

    .line 593
    return-object v1
.end method

.method public disconnect()V
    .locals 1

    .line 561
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->disconnect(I)V

    .line 562
    return-void
.end method

.method public declared-synchronized disconnect(I)V
    .locals 1

    monitor-enter p0

    .line 565
    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    :try_start_0
    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isQuitConnection:Z

    .line 566
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->shutdown()V

    .line 567
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->callConnectionClosedListener()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected finalize()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1159
    const-string v0, "sns"

    const-string v1, ": Shutting down executor services"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1166
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->executorService:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 1167
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->cachedExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1168
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 1169
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1175
    :try_start_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 1180
    goto :goto_1

    .line 1177
    :catch_0
    move-exception v2

    .line 1179
    const-string v0, "sns"

    const-string v1, "super.finalize() threw trhowable"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1182
    goto :goto_1

    .line 1170
    :catch_1
    move-exception v2

    .line 1171
    const-string v0, "sns"

    const-string v1, "finalize() threw trhowable"

    :try_start_2
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1175
    :try_start_3
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    .line 1180
    goto :goto_1

    .line 1177
    :catch_2
    move-exception v2

    .line 1179
    const-string v0, "sns"

    const-string v1, "super.finalize() threw trhowable"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1182
    goto :goto_1

    .line 1173
    :catchall_0
    move-exception v3

    .line 1175
    :try_start_4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    .line 1180
    goto :goto_0

    .line 1177
    :catch_3
    move-exception v4

    .line 1179
    const-string v0, "sns"

    const-string v1, "super.finalize() threw trhowable"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1182
    :goto_0
    throw v3

    .line 1183
    :goto_1
    return-void
.end method

.method public firePacketSendingListeners(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 6

    .line 707
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 708
    iget-object v2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    monitor-enter v2

    .line 709
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    .line 710
    invoke-virtual {v4, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->filterMatches(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 711
    invoke-virtual {v4}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->getListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 713
    :cond_0
    goto :goto_0

    .line 714
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 715
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 716
    return-void

    .line 719
    :cond_2
    new-instance v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$1;

    invoke-direct {v0, p0, v1, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$1;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncGo(Ljava/lang/Runnable;)V

    .line 732
    return-void
.end method

.method public getConfiguration()Lorg/jivesoftware/smack/ConnectionConfiguration;
    .locals 1

    .line 308
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    return-object v0
.end method

.method public getConnectionCounter()I
    .locals 1

    .line 1144
    iget v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionCounterValue:I

    return v0
.end method

.method protected getConnectionLock()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .line 491
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionLock:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method public getFeature(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F::Lorg/jivesoftware/smack/packet/ExtensionElement;>(Ljava/lang/String;Ljava/lang/String;)TF;"
        }
    .end annotation

    .line 1256
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamFeatures:Ljava/util/Map;

    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/ExtensionElement;

    return-object v0
.end method

.method public getFromMode()Lorg/jivesoftware/smack/XMPPConnection$FromMode;
    .locals 1

    .line 1154
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->fromMode:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    return-object v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .line 326
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->host:Ljava/lang/String;

    return-object v0
.end method

.method public getLastStanzaReceived()J
    .locals 2

    .line 1420
    iget-wide v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->lastStanzaReceived:J

    return-wide v0
.end method

.method public getPacketReplyTimeout()J
    .locals 2

    .line 783
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getReplyTimeout()J

    move-result-wide v0

    return-wide v0
.end method

.method public getParsingExceptionCallback()Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;
    .locals 1

    .line 1439
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->parsingExceptionCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    return-object v0
.end method

.method public getPort()I
    .locals 1

    .line 331
    iget v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->port:I

    return v0
.end method

.method public getReplyTimeout()J
    .locals 2

    .line 793
    iget-wide v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyTimeout:J

    return-wide v0
.end method

.method public getSASLAuthentication()Lorg/jivesoftware/smack/SASLAuthentication;
    .locals 1

    .line 551
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

    return-object v0
.end method

.method public getServiceName()Lo/fsz;
    .locals 1

    .line 313
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v0

    return-object v0
.end method

.method public getStreamId()Ljava/lang/String;
    .locals 1

    .line 420
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    const/4 v0, 0x0

    return-object v0

    .line 423
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsedSaslMechansism()Ljava/lang/String;
    .locals 1

    .line 456
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslAuthentication:Lorg/jivesoftware/smack/SASLAuthentication;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SASLAuthentication;->getNameOfLastUsedSaslMechansism()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getUser()Lo/fti;
    .locals 1

    .line 415
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->user:Lo/fti;

    return-object v0
.end method

.method public getXMPPServiceDomain()Lo/fsz;
    .locals 1

    .line 318
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->xmppServiceDomain:Lo/fsz;

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->xmppServiceDomain:Lo/fsz;

    return-object v0

    .line 321
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v0

    return-object v0
.end method

.method public hasFeature(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1261
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getFeature(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected initDebugger()V
    .locals 2

    .line 761
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->reader:Ljava/io/Reader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->writer:Ljava/io/Writer;

    if-nez v0, :cond_1

    .line 762
    :cond_0
    const-string v0, "sns"

    const-string v1, "Reader or writer isn\'t initialized."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    return-void

    .line 766
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->isDebuggerEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 767
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    if-nez v0, :cond_2

    .line 768
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->writer:Ljava/io/Writer;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->reader:Ljava/io/Reader;

    invoke-static {p0, v0, v1}, Lorg/jivesoftware/smack/SmackConfiguration;->createDebugger(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)Lorg/jivesoftware/smack/debugger/SmackDebugger;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    .line 771
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    if-nez v0, :cond_3

    .line 772
    const-string v0, "sns"

    const-string v1, "Debugging enabled but could not find debugger class"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 775
    :cond_3
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->reader:Ljava/io/Reader;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->newConnectionReader(Ljava/io/Reader;)Ljava/io/Reader;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->reader:Ljava/io/Reader;

    .line 776
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->debugger:Lorg/jivesoftware/smack/debugger/SmackDebugger;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->writer:Ljava/io/Writer;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/debugger/SmackDebugger;->newConnectionWriter(Ljava/io/Writer;)Ljava/io/Writer;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->writer:Ljava/io/Writer;

    .line 779
    :cond_4
    :goto_0
    return-void
.end method

.method protected invokeStanzaCollectorsAndNotifyRecvListeners(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 11

    .line 876
    instance-of v0, p1, Lorg/jivesoftware/smack/packet/IQ;

    if-eqz v0, :cond_2

    .line 877
    move-object v2, p1

    check-cast v2, Lorg/jivesoftware/smack/packet/IQ;

    .line 878
    invoke-virtual {v2}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v3

    .line 879
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->a:[I

    invoke-virtual {v3}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_7

    .line 882
    :sswitch_0
    invoke-virtual {v2}, Lorg/jivesoftware/smack/packet/IQ;->getChildElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lorg/jivesoftware/smack/packet/IQ;->getChildElementNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 883
    const/4 v5, 0x0

    .line 884
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->a:[I

    invoke-virtual {v3}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 886
    :sswitch_1
    iget-object v6, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    monitor-enter v6

    .line 887
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 888
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 889
    :goto_0
    goto :goto_3

    .line 891
    :sswitch_2
    iget-object v6, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    monitor-enter v6

    .line 892
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 893
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 894
    :goto_1
    goto :goto_3

    .line 896
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should only encounter IQ type \'get\' or \'set\'"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 898
    :goto_3
    if-nez v5, :cond_1

    .line 899
    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnkownIq:Z

    if-nez v0, :cond_0

    .line 900
    return-void

    .line 904
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->service_unavailable:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-static {v2, v0}, Lorg/jivesoftware/smack/packet/IQ;->createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError$Builder;)Lorg/jivesoftware/smack/packet/ErrorIQ;

    move-result-object v6

    .line 907
    :try_start_2
    invoke-virtual {p0, v6}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 911
    goto :goto_4

    .line 909
    :catch_0
    move-exception v7

    .line 910
    const-string v0, "sns"

    const-string v1, "Exception while sending error IQ to unkown IQ request"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    :goto_4
    goto :goto_7

    .line 913
    :cond_1
    const/4 v6, 0x0

    .line 914
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->c:[I

    invoke-interface {v5}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getMode()Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler$Mode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_2

    goto :goto_5

    .line 916
    :sswitch_3
    iget-object v6, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 917
    goto :goto_6

    .line 919
    :sswitch_4
    iget-object v6, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->cachedExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 920
    goto :goto_6

    .line 922
    :goto_5
    iget-object v6, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 925
    :goto_6
    move-object v7, v5

    .line 926
    new-instance v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;

    invoke-direct {v0, p0, v7, v2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;Lorg/jivesoftware/smack/packet/IQ;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 949
    return-void

    .line 960
    :cond_2
    :goto_7
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 961
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    monitor-enter v3

    .line 962
    :try_start_3
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    .line 963
    invoke-virtual {v5, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->filterMatches(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 964
    invoke-virtual {v5}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->getListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 966
    :cond_3
    goto :goto_8

    .line 967
    :cond_4
    monitor-exit v3

    goto :goto_9

    :catchall_2
    move-exception v9

    monitor-exit v3

    throw v9

    .line 969
    :goto_9
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/StanzaListener;

    .line 970
    new-instance v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;

    invoke-direct {v0, p0, v4, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/packet/Stanza;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncGo(Ljava/lang/Runnable;)V

    .line 980
    goto :goto_a

    .line 983
    :cond_5
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->collectors:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/StanzaCollector;

    .line 984
    invoke-virtual {v4, p1}, Lorg/jivesoftware/smack/StanzaCollector;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 985
    goto :goto_b

    .line 988
    :cond_6
    invoke-interface {v2}, Ljava/util/Collection;->clear()V

    .line 989
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    monitor-enter v3

    .line 990
    :try_start_4
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;

    .line 991
    invoke-virtual {v5, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->filterMatches(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 992
    invoke-virtual {v5}, Lorg/jivesoftware/smack/AbstractXMPPConnection$ListenerWrapper;->getListener()Lorg/jivesoftware/smack/StanzaListener;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 994
    :cond_7
    goto :goto_c

    .line 995
    :cond_8
    monitor-exit v3

    goto :goto_d

    :catchall_3
    move-exception v10

    monitor-exit v3

    throw v10

    .line 999
    :goto_d
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->singleThreadedExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;

    invoke-direct {v1, p0, v2, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/util/Collection;Lorg/jivesoftware/smack/packet/Stanza;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1015
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
    .end sparse-switch
.end method

.method public final isAnonymous()Z
    .locals 2

    .line 444
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ANONYMOUS"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getUsedSaslMechansism()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isAuthenticated()Z
    .locals 1

    .line 410
    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->authenticated:Z

    return v0
.end method

.method public final isConnected()Z
    .locals 1

    .line 405
    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connected:Z

    return v0
.end method

.method public abstract isSecureConnection()Z
.end method

.method public abstract isUsingCompression()Z
.end method

.method public abstract login(Lorg/jivesoftware/smack/SASLConfiguration;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/XMPPException;,
            Lorg/jivesoftware/smack/SmackException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public parseAndProcessStanza(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 828
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 829
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    .line 830
    const/4 v2, 0x0

    .line 832
    :try_start_0
    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseStanza(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Stanza;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 842
    goto :goto_0

    .line 834
    :catch_0
    move-exception v3

    .line 835
    invoke-static {p1, v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 837
    new-instance v5, Lorg/jivesoftware/smack/UnparseableStanza;

    invoke-direct {v5, v4, v3}, Lorg/jivesoftware/smack/UnparseableStanza;-><init>(Ljava/lang/CharSequence;Ljava/lang/Exception;)V

    .line 838
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getParsingExceptionCallback()Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    move-result-object v6

    .line 839
    if-eqz v6, :cond_0

    .line 840
    invoke-interface {v6, v5}, Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;->handleUnparsableStanza(Lorg/jivesoftware/smack/UnparseableStanza;)V

    .line 843
    :cond_0
    :goto_0
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtEndTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 844
    if-eqz v2, :cond_1

    .line 845
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 847
    :cond_1
    return-void
.end method

.method protected final parseFeatures(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1186
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->streamFeatures:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 1187
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    .line 1189
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 1191
    const/4 v0, 0x2

    if-ne v3, v0, :cond_3

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    add-int/lit8 v1, v2, 0x1

    if-ne v0, v1, :cond_3

    .line 1192
    const/4 v4, 0x0

    .line 1193
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 1194
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v6

    .line 1195
    move-object v7, v5

    const/4 v8, -0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "starttls"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "mechanisms"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "bind"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "session"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "compression"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x4

    :cond_0
    :goto_1
    packed-switch v8, :pswitch_data_0

    goto :goto_2

    .line 1197
    :pswitch_0
    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseStartTlsFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/StartTls;

    move-result-object v4

    .line 1198
    goto :goto_3

    .line 1200
    :pswitch_1
    new-instance v4, Lorg/jivesoftware/smack/packet/Mechanisms;

    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseMechanisms(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/jivesoftware/smack/packet/Mechanisms;-><init>(Ljava/util/Collection;)V

    .line 1201
    goto :goto_3

    .line 1203
    :pswitch_2
    sget-object v4, Lorg/jivesoftware/smack/packet/Bind$Feature;->INSTANCE:Lorg/jivesoftware/smack/packet/Bind$Feature;

    .line 1204
    goto :goto_3

    .line 1206
    :pswitch_3
    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseSessionFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Session$Feature;

    move-result-object v4

    .line 1207
    goto :goto_3

    .line 1209
    :pswitch_4
    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseCompressionFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/compress/packet/Compress$Feature;

    move-result-object v4

    .line 1210
    goto :goto_3

    .line 1212
    :goto_2
    invoke-static {v5, v6}, Lorg/jivesoftware/smack/provider/ProviderManager;->getStreamFeatureProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    move-result-object v9

    .line 1213
    if-eqz v9, :cond_1

    .line 1214
    invoke-virtual {v9, p1}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Element;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 1218
    :cond_1
    :goto_3
    if-eqz v4, :cond_2

    .line 1219
    invoke-virtual {p0, v4}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->addStreamFeature(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 1221
    :cond_2
    goto :goto_4

    .line 1222
    :cond_3
    const/4 v0, 0x3

    if-ne v3, v0, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 1223
    goto :goto_5

    .line 1225
    :cond_4
    :goto_4
    goto/16 :goto_0

    .line 1227
    :goto_5
    const-string v0, "mechanisms"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->hasFeature(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1229
    const-string v0, "starttls"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-tls"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->hasFeature(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 1230
    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->getSecurityMode()Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    if-ne v0, v1, :cond_6

    .line 1231
    :cond_5
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->saslFeatureReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 1237
    :cond_6
    const-string v0, "bind"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-bind"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->hasFeature(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1238
    const-string v0, "compression"

    const-string v1, "http://jabber.org/protocol/compress"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->hasFeature(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->config:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 1239
    invoke-virtual {v0}, Lorg/jivesoftware/smack/ConnectionConfiguration;->isCompressionEnabled()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1242
    :cond_7
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->lastFeaturesReceived:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 1245
    :cond_8
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->afterFeaturesReceived()V

    .line 1246
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2858f7c6 -> :sswitch_1
        0x2e243d -> :sswitch_2
        0x4e7d0959 -> :sswitch_0
        0x555a5966 -> :sswitch_4
        0x76508296 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 858
    sget-boolean v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 859
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->lastStanzaReceived:J

    .line 861
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->executorService:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    new-instance v1, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;

    invoke-direct {v1, p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->executeBlocking(Ljava/lang/Runnable;)V

    .line 867
    return-void
.end method

.method public registerIQRequestHandler(Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;)Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    .locals 6

    .line 1378
    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getElement()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1379
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->a:[I

    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1381
    :sswitch_0
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    monitor-enter v3

    .line 1382
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 1383
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 1385
    :sswitch_1
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    monitor-enter v3

    .line 1386
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v3

    return-object v0

    .line 1387
    :catchall_1
    move-exception v5

    monitor-exit v3

    throw v5

    .line 1389
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only IQ type of \'get\' and \'set\' allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public removeAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z
    .locals 3

    .line 674
    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    monitor-enter v1

    .line 675
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->asyncRecvListeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    .line 676
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public removeConnectionListener(Lorg/jivesoftware/smack/ConnectionListener;)V
    .locals 1

    .line 585
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->connectionListeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 586
    return-void
.end method

.method public removePacketInterceptor(Lorg/jivesoftware/smack/StanzaListener;)V
    .locals 3

    .line 748
    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->interceptors:Ljava/util/Map;

    monitor-enter v1

    .line 749
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->interceptors:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 750
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 751
    :goto_0
    return-void
.end method

.method public removePacketListener(Lorg/jivesoftware/smack/StanzaListener;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 640
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    move-result v0

    return v0
.end method

.method public removePacketSendingListener(Lorg/jivesoftware/smack/StanzaListener;)V
    .locals 3

    .line 692
    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    monitor-enter v1

    .line 693
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendListeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 694
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 695
    :goto_0
    return-void
.end method

.method public removeStanzaCollector(Lorg/jivesoftware/smack/StanzaCollector;)V
    .locals 1

    .line 628
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->collectors:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 629
    return-void
.end method

.method public removeSyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z
    .locals 3

    .line 656
    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    monitor-enter v1

    .line 657
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->syncRecvListeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    .line 658
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method protected final schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation

    .line 1452
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    return-object v0
.end method

.method public sendIqWithResponseCallback(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/StanzaListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1338
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendIqWithResponseCallback(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V

    .line 1339
    return-void
.end method

.method public sendIqWithResponseCallback(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1344
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getReplyTimeout()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendIqWithResponseCallback(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V

    .line 1345
    return-void
.end method

.method public sendIqWithResponseCallback(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1351
    new-instance v7, Lorg/jivesoftware/smack/filter/IQReplyFilter;

    invoke-direct {v7, p1, p0}, Lorg/jivesoftware/smack/filter/IQReplyFilter;-><init>(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/XMPPConnection;)V

    .line 1352
    move-object v0, p0

    move-object v1, p1

    move-object v2, v7

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V

    .line 1353
    return-void
.end method

.method public abstract sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public sendPacket(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 519
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 520
    return-void
.end method

.method public sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 524
    const-string v0, "Stanza must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 525
    sget-boolean v0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Message;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/jivesoftware/smack/packet/Presence;

    if-nez v0, :cond_0

    instance-of v0, p1, Lorg/jivesoftware/smack/packet/IQ;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 527
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->throwNotConnectedExceptionIfAppropriate()V

    .line 528
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->b:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->fromMode:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/XMPPConnection$FromMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 530
    :pswitch_0
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/packet/Stanza;->setFrom(Lo/fte;)V

    .line 531
    goto :goto_0

    .line 533
    :pswitch_1
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getUser()Lo/fti;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/packet/Stanza;->setFrom(Lo/fte;)V

    .line 534
    .line 540
    :goto_0
    :pswitch_2
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaInternal(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 541
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected abstract sendStanzaInternal(Lorg/jivesoftware/smack/packet/Stanza;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1272
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V

    .line 1273
    return-void
.end method

.method public sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1279
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1280
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getReplyTimeout()J

    move-result-wide v5

    .line 1279
    invoke-virtual/range {v0 .. v6}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V

    .line 1281
    return-void
.end method

.method public sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1287
    const-string v0, "stanza must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1290
    const-string v0, "replyFilter must not be null"

    invoke-static {p2, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1291
    const-string v0, "callback must not be null"

    invoke-static {p3, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1293
    new-instance v3, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;

    invoke-direct {v3, p0, p3, p4}, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V

    .line 1313
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeCallbacksService:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;

    invoke-direct {v1, p0, v3, p4, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p5, p6, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1331
    invoke-virtual {p0, v3, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->addAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 1332
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 1333
    return-void
.end method

.method public setFromMode(Lorg/jivesoftware/smack/XMPPConnection$FromMode;)V
    .locals 0

    .line 1149
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->fromMode:Lorg/jivesoftware/smack/XMPPConnection$FromMode;

    .line 1150
    return-void
.end method

.method public setPacketReplyTimeout(J)V
    .locals 0

    .line 788
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setReplyTimeout(J)V

    .line 789
    return-void
.end method

.method public setParsingExceptionCallback(Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;)V
    .locals 0

    .line 1430
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->parsingExceptionCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    .line 1431
    return-void
.end method

.method public setReplyTimeout(J)V
    .locals 0

    .line 798
    iput-wide p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyTimeout:J

    .line 799
    return-void
.end method

.method public setReplyToUnknownIq(Z)V
    .locals 0

    .line 824
    iput-boolean p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->replyToUnkownIq:Z

    .line 825
    return-void
.end method

.method protected setWasAuthenticated()V
    .locals 1

    .line 1024
    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->wasAuthenticated:Z

    if-nez v0, :cond_0

    .line 1025
    iget-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->authenticated:Z

    iput-boolean v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->wasAuthenticated:Z

    .line 1027
    :cond_0
    return-void
.end method

.method protected abstract shutdown()V
.end method

.method protected throwAlreadyConnectedExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;
        }
    .end annotation

    .line 505
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 506
    new-instance v0, Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$AlreadyConnectedException;-><init>()V

    throw v0

    .line 508
    :cond_0
    return-void
.end method

.method protected throwAlreadyLoggedInExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;
        }
    .end annotation

    .line 511
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    new-instance v0, Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$AlreadyLoggedInException;-><init>()V

    throw v0

    .line 514
    :cond_0
    return-void
.end method

.method protected throwNotConnectedExceptionIfAppropriate()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 495
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->throwNotConnectedExceptionIfAppropriate(Ljava/lang/String;)V

    .line 496
    return-void
.end method

.method protected throwNotConnectedExceptionIfAppropriate(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 499
    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 500
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    invoke-direct {v0, p1}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 502
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1444
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getConnectionCounter()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unregisterIQRequestHandler(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/IQ$Type;)Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    .locals 6

    .line 1401
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1402
    sget-object v0, Lorg/jivesoftware/smack/AbstractXMPPConnection$2;->a:[I

    invoke-virtual {p3}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1404
    :sswitch_0
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    monitor-enter v3

    .line 1405
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->setIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 1406
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 1408
    :sswitch_1
    iget-object v3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    monitor-enter v3

    .line 1409
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getIqRequestHandler:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v3

    return-object v0

    .line 1410
    :catchall_1
    move-exception v5

    monitor-exit v3

    throw v5

    .line 1412
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only IQ type of \'get\' and \'set\' allowed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final unregisterIQRequestHandler(Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;)Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;
    .locals 3

    .line 1395
    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getElement()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getNamespace()Ljava/lang/String;

    move-result-object v1

    .line 1396
    invoke-interface {p1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v2

    .line 1395
    invoke-virtual {p0, v0, v1, v2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->unregisterIQRequestHandler(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/IQ$Type;)Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;

    move-result-object v0

    return-object v0
.end method
