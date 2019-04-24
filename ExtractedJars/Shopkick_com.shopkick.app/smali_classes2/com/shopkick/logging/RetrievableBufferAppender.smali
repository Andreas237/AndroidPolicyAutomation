.class public Lcom/shopkick/logging/RetrievableBufferAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "RetrievableBufferAppender.java"


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;

.field public static final MaxMessageHistory:I = 0x3e8


# instance fields
.field private bufferSize:Ljava/util/concurrent/atomic/AtomicLong;

.field private logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentSkipListMap<",
            "Ljava/lang/Long;",
            "Lcom/shopkick/logging/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Lcom/shopkick/logging/RetrievableBufferAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/RetrievableBufferAppender;->APPENDER_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->bufferSize:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->bufferSize:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 69
    iget-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->clear()V

    return-void
.end method

.method public getAll()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/shopkick/logging/Message;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 74
    sget-object v0, Lcom/shopkick/logging/RetrievableBufferAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 4

    if-eqz p1, :cond_2

    const-string v0, "LEVEL"

    .line 32
    const-class v1, Lcom/shopkick/logging/Level;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Level;

    .line 34
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/RetrievableBufferAppender;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object v1

    .line 36
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/RetrievableBufferAppender;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v1, v0}, Lcom/shopkick/logging/AppenderConfig;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getAreas()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lcom/shopkick/logging/RetrievableBufferAppender;->isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/logging/RetrievableBufferAppender;->shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 41
    iget-object p2, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->bufferSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffff9bL

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/logging/RetrievableBufferAppender;->clear()V

    .line 46
    :cond_0
    iget-object p2, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    iget-object v0, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->bufferSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :goto_0
    iget-object p1, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->size()I

    move-result p1

    const/16 p2, 0x3e8

    if-le p1, p2, :cond_1

    .line 50
    iget-object p1, p0, Lcom/shopkick/logging/RetrievableBufferAppender;->logBuffer:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListMap;->firstKey()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentSkipListMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void

    .line 30
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'message\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
